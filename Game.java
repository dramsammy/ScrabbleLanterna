import java.util.ArrayList;
import java.util.*;
import com.googlecode.lanterna.terminal.Terminal.SGR;
import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.Key.Kind;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.Terminal.Color;
import com.googlecode.lanterna.terminal.TerminalSize;
import com.googlecode.lanterna.LanternaException;
import com.googlecode.lanterna.input.CharacterPattern;
import com.googlecode.lanterna.input.InputDecoder;
import com.googlecode.lanterna.input.InputProvider;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.KeyMappingProfile;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.gui.component.TextBox;
public class Game extends Board {
  private int Players;
  private Board gameBoard;
  private Player player1;
  private Player player2;
  private Player player3;
  private Player player4;
  private String playerData = "";


  //Game constructor
  public Game(int play){
    gameBoard = new Board();//initializing board
    Players = play;
    if (play<=4 && play >=1){//creating players with 4 possibilities for the different amount of players
      if(play>=1){
        player1 = new Player(gameBoard, "Player1");
        playerData += player1.toString();
    }
      if(play>=2){
        player2=new Player(gameBoard, "Player2");
        playerData += player2.toString();
    }
      if(play>=3){
        player3=new Player(gameBoard, "Player3");
        playerData += player3.toString();
    }
      if(play>=4){
        player4=new Player(gameBoard, "Player4");
        playerData += player4.toString();
    }
  }
}


  //makes a name for each player
  public String returnString(int i){
    return "Player" + i;
  }

  //Figure out a way to reset the game
  /*public void newgame(){
    //reinitialize game?
  }*/
  //prints toString for key on the side
  public String key(){
    String key ="PIECE TO POINTS KEY\n";
    key += "A = 1, B = 3, C = 3 \n";
    key += "D = 2, E = 1, F = 4 \n";
    key += "G = 2, H = 4, I = 1 \n";
    key += "J = 8, K = 5, L = 1 \n";
    key += "M = 3, N = 1, O = 1 \n";
    key += "P = 3, Q = 10, R = 1\n";
    key += "S = 1, T = 1, U = 1 \n";
    key += "V = 4, W = 4, X = 8 \n";
    key += "   Y = 4, Z = 10    ";
    return key;
  }

  //splits a string on the normal new line character and calls putline for each one
  public static void putString(int r, int c, Terminal t, String s, Board g){
    List<String> eachline = Arrays.asList(s.split("\n"));
    int curr=c;
    for(int i=0;i<eachline.size();i++){
      putLine(r, curr, t, eachline.get(i), g);
      curr++;
    }

}

//splits on made up escape character to hold color and calls putchar with color
public static void putLine(int r, int c, Terminal t, String s, Board g){
  List<String> eachpiece = Arrays.asList(s.split("\\)"));
  char curr;
  int len;
  for(int i = 0; i < eachpiece.size();i++){
    curr= eachpiece.get(i).charAt(0);
    len=eachpiece.get(i).length();
    if(curr=='|'){
      putchar(r+i,c,t,'|',g ,"WHITE");
  }
    else{
      putchar(r+i,c,t,curr,g,eachpiece.get(i).substring(1,len));
    }
}


}
//puts in a char and uses the imputted color
public static void putchar(int r, int c, Terminal t, char s, Board g, String C){
  t.moveCursor(r,c);
  if(C.equals("PURPLE")){
    t.applyBackgroundColor(Terminal.Color.MAGENTA);
  }
  if(C.equals("ORANGE")){
    t.applyBackgroundColor(Terminal.Color.YELLOW);
  }
  if(C.equals("INDIGO")){
    t.applyBackgroundColor(Terminal.Color.CYAN);
  }
  if(C.equals("BLUE")){
    //t.applyBackgroundColor(0,0,205);
    t.applyBackgroundColor(Terminal.Color.BLUE);
  }
  if(C.equals("WHITE")){
    t.applyBackgroundColor(Terminal.Color.WHITE);
  }
  t.putCharacter(s);
}

//puts a game board with coordinates
public static void putCoordinatedBoard(Terminal t, Game g){
  String p ="";
  for(int i=1; i<16;i++){
    if(i<10){
      p = ""+ 0 + i;
    }
    else{
      p = i + "";
    }
    putString(41, (3+i), t, p);
  }
  putString(43, 4, t, g.gameBoard.toString(), g.gameBoard);
  putString(41, 3, t, "   A B C D E F G H I J K L M N O ");

}

//put string method when it does not need to deal with color of middle indenting
public static void putString(int r, int c, Terminal t, String s){
    t.moveCursor(r,c);
    for(int i = 0; i < s.length();i++){
      t.putCharacter(s.charAt(i));
    }
  }


//key for the side of the home screen which shows the colors
public String colorkey(){
    String colorkey = "COLOR TO MULTIPLIER KEY\n";
    colorkey+="Magenta: Double Word \nYellow: Triple Word\n";
    colorkey+="Cyan: Double Letter \nDeep Blue: Triple Letter";
    return colorkey;
  }



//add in comments
public static void main(String[] args) {
    Game newGame = new Game(4);//replace with args
  //Player human = new Player(newGame.gameBoard);
    Terminal screen = TerminalFacade.createTextTerminal();
    screen.enterPrivateMode();
    boolean display = true;
    TerminalSize size = screen.getTerminalSize();
    screen.setCursorVisible(false);
    boolean move = true;
    boolean begin = true;
    boolean menu = true;
    String piece = "";
    String coordinates= "";
    int position = 8;
    int amount = 0;
    int y = 0;
    int x = 0;
    int dir = 0;
    int temp = 0;
    while (menu){
      Key menuChoice = screen.readInput();
      screen.applyBackgroundColor(Terminal.Color.WHITE);
      screen.applyForegroundColor(Terminal.Color.BLACK);
      putString(0, 0, screen, "MENU OPTIONS");
      putString(0, 1, screen, "New Game [1]");
      //putString(0, 2, screen, "Last Game Results [2]");
      putString(0, 3, screen, "Instructions to Play [2]");
      putString(0, 5, screen, "To exit PRESS the key: e");
      if (menuChoice != null && (menuChoice.getCharacter() == 'e')){
          screen.exitPrivateMode();
          menu = false;
          System.exit(1);
        }
      if (menuChoice != null && (menuChoice.getCharacter() == '2')){
        putString(0, 5, screen, "To play Scrabble 2.0, please select New Game. You will be prompted for a player amount. Please enter the amount of players in the game. AFterwards, you will be presented with the scrabble GUI along with a key and a scoreboard. Follow the onscreen instructions to cycle through the screens in order to play the game. Have Fun!!!");
      }
      if (menuChoice != null && (menuChoice.getCharacter() == '1')){
        display = true;
        screen.applyBackgroundColor(Terminal.Color.DEFAULT);
        screen.clearScreen();
          while(display){
            Key key = screen.readInput();
            screen.applyBackgroundColor(Terminal.Color.WHITE);
            putString(43, 2, screen, newGame.gameBoard.toString(), newGame.gameBoard);
            putString(52, 0, screen, "SCRABBLE 2.0" );
            putString(36, 20, screen,"Player Hand:" + newGame.player1.handToString());
            putString(36, 21, screen,"Hand Position:0 ,  1 ,  2 ,  3 ,  4 ,  5 ,  6 ");
            putString(0, 0, screen, newGame.playerData);
            //putString(0, 5, screen, "___________________________");
            putString(0, 5, screen, newGame.key());
            putString(0, 16, screen, newGame.colorkey());
            putString(0, 22, screen, "To make a move PRESS the key: s");
            putString(0, 23, screen, "To exit PRESS the key: e");
            screen.applyForegroundColor(Terminal.Color.BLACK);
            screen.moveCursor(0,0);
            if (key != null && (key.getCharacter() == 'e')){
                screen.exitPrivateMode();
                display = false;
                System.exit(1);
              }
            if (key != null && key.getCharacter() == 's'){
              move = true;
              screen.applyBackgroundColor(Terminal.Color.DEFAULT);
              screen.clearScreen();
              while(move){
                Key key1 = screen.readInput();
                ArrayList<Integer> choices = new ArrayList<Integer>();
                if (key1 != null && (key1.getKind() == Key.Kind.Enter)){
                    move = false;
                    piece = "";
                    screen.clearScreen();
                  }
                screen.applyBackgroundColor(Terminal.Color.WHITE);
                screen.applyForegroundColor(Terminal.Color.BLACK);
                putString(0, 0, screen, "To make a move, type in the numbers from 0-6 you will use in your hand in order and press the key s when finished");
                if (key1 != null && (Character.toString(key1.getCharacter()).equals("0") || Character.toString(key1.getCharacter()).equals("1") || Character.toString(key1.getCharacter()).equals("2") || Character.toString(key1.getCharacter()).equals("3") || Character.toString(key1.getCharacter()).equals("4") || Character.toString(key1.getCharacter()).equals("5") || Character.toString(key1.getCharacter()).equals("6"))) {
                  putString(0, 1, screen, Character.toString(key1.getCharacter()));
                  piece += (newGame.player1.theHand)[(Character.getNumericValue(key1.getCharacter()))].handpiecetoString() + "";
                  amount++;
                  choices.add(Character.getNumericValue(key1.getCharacter()));
                  newGame.player1.theHandArrayList.remove(newGame.player1.theHand[Character.getNumericValue(key1.getCharacter())]);
                }
                putString(0, 2, screen, piece);
                putString(0, 3,screen, "To go back or start over, press enter");
                putString(0, 4, screen,"Player Hand:" + newGame.player1.handToString());
                putString(0, 5, screen,"Hand Position:0 ,  1 ,  2 ,  3 ,  4 ,  5 ,  6 ");
                if (key1 != null && key1.getCharacter() == 's'){
                  begin = true;
                  screen.applyBackgroundColor(Terminal.Color.DEFAULT);
                  screen.clearScreen();
                  while(begin){
                    Pieces[] coords = new Pieces[amount];
                    Pieces[] play = new Pieces[amount];
                    for (int i = 0; i < choices.size(); i++){
                      play[i] = newGame.player1.theHand[choices.get(i)];
                    }
                    Key key2 = screen.readInput();
                    screen.applyBackgroundColor(Terminal.Color.WHITE);
                    screen.applyForegroundColor(Terminal.Color.BLACK);
                    putString(0, 0, screen, "To finish your move, type in the coordinates of each piece you will use on the board in (letter,number) format (eg: (a,1)) and press the enter key /");
                    putString(0, 3,screen, "To go back, press enter");
                    putString(0, 20, screen, "These are the Pieces you previously selected: " + piece);
                    putCoordinatedBoard(screen, newGame);
                    if (key2 != null && key2.getCharacter() != '/'){
                      putString(0, 6, screen, Character.toString(key2.getCharacter()));
                      coordinates += key2.getCharacter() + "";
                      putString(0, 7, screen, coordinates);
                    }
                    if (key2 != null && key2.getKind() == Key.Kind.Backspace){
                      putString(0, 7, screen, "                ");
                      coordinates = "";
                    }

                    if (key2 != null && '/' == key2.getCharacter() && amount!= 0){
                      putString(0,position, screen, coordinates);
                      if (y == 0){
                        y = Integer.parseInt(coordinates.substring(3,4)) - 1;
                        x = Board.getX(coordinates.charAt(1));
                      }
                      if (y < Integer.parseInt(coordinates.substring(3,4)) - 1 || y > Integer.parseInt(coordinates.substring(3,4)) - 1){
                        if (y != 0){
                          dir = -1;
                        }
                        else{
                          dir = 1;
                        }
                      }
                      amount--;
                      if (coordinates.length() != 0){
                        coords[position - 8] = (newGame.gameBoard.coordtoPiece(coordinates.charAt(1), Integer.parseInt(coordinates.substring(3,4)) - 1));
                        coordinates = "";
                        position++;
                      }
                      putString(0, 7, screen, "                ");
                    }
                    if (key2 != null && '.' == key2.getCharacter()){
                        putString(1,20,screen,String.valueOf(newGame.gameBoard.isValidPlay(play, 5, 5, -1)));
                    }

                      screen.applyBackgroundColor(Terminal.Color.DEFAULT);
                    if (key2 != null && (key2.getKind() == Key.Kind.Enter)){
                        begin = false;
                        piece = "";
                        coordinates = "";
                        screen.clearScreen();
                      }
                  }
                screen.applyBackgroundColor(Terminal.Color.DEFAULT);
              }
              }
              screen.applyBackgroundColor(Terminal.Color.DEFAULT);
              screen.clearScreen();
            }
      }
      }
      }
}
}

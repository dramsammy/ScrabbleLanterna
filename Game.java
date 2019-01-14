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
public class Game {
  private int Players;
  private Board gameBoard;
  private TextBox theMove = new TextBox("Move", 5);
  // private ArrayList<char> hand1=new ArrayList<int>();
  // private ArrayList<char> hand2=new ArrayList<int>();
  // private ArrayList<char> hand3=new ArrayList<int>();
  // private ArrayList<char> hand4=new ArrayList<int>();

  //Game constructor
  //Starts by creating the pile of pieces
  //Creates each player and their hand
  public Game(int play){
    gameBoard = new Board();
    Players = play;
  }

  //makes a name for each player
  public String returnString(int i){
    return "Player" + i;
  }

  //Figure out a way to reset the game
  public void newgame(){
    //reinitialize game?
  }
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

  /*public void Start(){
    Players.drawNewHand(); // need to fix for multiple players
}*/

  //creates a full scoreboard(temporarily just displays random stuff)
   public String displayNames(){
    String str = "TEMPORARY PLACEHOLDER FOR REAL PLAYERS \n\nPoints!!!\n";
    for(int i=0; i< Players;i++){//may run into same name issue as constructor
      str+= "Player" + (i+1) + ": ";//TEMPORARY
      str+= (i+ 46);
      str+="\n";
      //str+= (returnString(i)).    FIGURE OUT HOW TO REFERENCE PLAYER TO STRING
    }
    return str;
  }
  public static void putString(int r, int c, Terminal t, String s, Board g){
    List<String> eachline = Arrays.asList(s.split("\n"));
    int curr=c;
    for(int i=0;i<eachline.size();i++){
      putLine(r, curr, t, eachline.get(i), g);
      curr++;
    }

}
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
//put in mods so it includes |
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

public static void putString(int r, int c, Terminal t, String s){
    t.moveCursor(r,c);
    for(int i = 0; i < s.length();i++){
      t.putCharacter(s.charAt(i));
    }
  }
  public String colorkey(){
    String colorkey = "COLOR TO MULTIPLIER KEY\n";
    colorkey+="Magenta: Double Word \nYellow: Triple Word\n";
    colorkey+="Cyan: Double Letter \nDeep Blue: Triple Letter";
    return colorkey;
  }




  public static void main(String[] args) {
    Game newGame = new Game(2);//replace with args
    //Player human = new Player();
    Terminal screen = TerminalFacade.createTextTerminal();
    screen.enterPrivateMode();
    boolean display = true;
    TerminalSize size = screen.getTerminalSize();
    screen.setCursorVisible(false);
    boolean move = true;
    while(display){
      Key key = screen.readInput();
      screen.applyBackgroundColor(Terminal.Color.WHITE);
      putString(54, 0, screen, "SCRABBLE 2.0" );
      putString(45, 2, screen, newGame.gameBoard.toString(), newGame.gameBoard);
      putString(45, 20, screen,"Player Hand:");
      putString(0, 0, screen, newGame.displayNames());
      putString(0, 5, screen, "___________________________");
      putString(0, 7, screen, newGame.key());
      putString(0, 18, screen, newGame.colorkey());
      putString(0, 24, screen, "To make a move PRESS the key: s");
      putString(0, 25, screen, "To exit PRESS the key: e");
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
          if (key1 != null && (key1.getKind() == Key.Kind.Enter)){
              move = false;
            }
          screen.applyBackgroundColor(Terminal.Color.WHITE);
          screen.applyForegroundColor(Terminal.Color.BLACK);
          putString(0, 0, screen, "To make a move, type in the numbers you will use in your hand in order");
          putString(0,1,screen, "To move on, press enter");
          screen.applyBackgroundColor(Terminal.Color.DEFAULT);
        }
        screen.clearScreen();
        }
      }
}
}

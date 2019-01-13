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

public class Game {
  private int Players;
  private Board gameBoard;
  private ArrayList<Character> pile= new ArrayList<Character>();
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
    ArrayList<Character> p =new ArrayList<Character>();
    p.add('X');
    p.add('Z');
    p.add('Q');
    p.add('K');
    p.add('J');
    for(int i=0;i<2;i++){
      p.add('Y');
      p.add('W');
      p.add('V');
      p.add('P');
      p.add('M');
      p.add('H');
      p.add('F');
      p.add('C');
      p.add('B');
    }
    for(int i=0;i<3;i++){
      p.add('G');
    }
    for(int i=0;i<4;i++){
      p.add('U');
      p.add('S');
      p.add('L');
      p.add('D');
    }
    for(int i=0;i<2;i++){
      p.add('Y');
      p.add('W');
      p.add('V');
      p.add('P');
      p.add('M');
      p.add('H');
      p.add('F');
      p.add('C');
      p.add('B');
    }
    for(int i=0;i<6;i++){
      p.add('T');
      p.add('R');
      p.add('N');
    }
    for(int i=0;i<8;i++){
      p.add('O');
    }
    for(int i=0;i<9;i++){
      p.add('I');
      p.add('A');
    }
    for(int i=0;i<12;i++){
      p.add('E');
    }
    //BLANK TILES
    pile=p;
    for (int i = 0; i < Players; i++){
      /*Player i = new Player();//ISSUE WITH NAMING IT
      i.drawNewHand();*/
    }
  }

  //makes a name for each player
  public String returnString(int i){
    return "Player" + i;
  }

  //Figure out a way to reset the game
  public void newgame(){
    //reinitialize game?
  }



  /*public void Start(){
    Players.drawNewHand(); // need to fix for multiple players
}*/

  //creates a full scoreboard(temporarily just displays random stuff)
   public String displayNames(){
    String str = "TEMPORARY PLACEHOLDER FOR REAL PLAYERS \n \nPoints!!! \n";
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
    t.applyBackgroundColor(Terminal.Color.DEFAULT);
  }
  t.putCharacter(s);
}

public static void putString(int r, int c, Terminal t, String s){
    t.moveCursor(r,c);
    for(int i = 0; i < s.length();i++){
      t.putCharacter(s.charAt(i));
    }
  }



  public static void main(String[] args) {
    Game newGame = new Game(2);//replace with args
    Terminal screen = TerminalFacade.createTextTerminal();
    screen.enterPrivateMode();
    boolean display = true;
    TerminalSize size = screen.getTerminalSize();
    screen.setCursorVisible(false);
    while(display){
      Key key = screen.readInput();
      //Textbox t= new TextBox(12, "SCRABBLE 2.0™", SINGLE_LINE);
      putString(53, 0, screen, "SCRABBLE 2.0™" );
      putString(45, 2, screen, newGame.gameBoard.toString(), newGame.gameBoard);
      putString(0, 0, screen, newGame.displayNames());
			screen.applyForegroundColor(Terminal.Color.BLACK);
      screen.moveCursor(0,0);
      if (key != null){
          screen.exitPrivateMode();
          display = false;
          System.exit(1);
       }
}
}
}

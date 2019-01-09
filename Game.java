import java.util.ArrayList;
public class Game {
  private int Players;
  private Board gameBoard;
  private ArrayList<char> pile= new ArrayList<int>();
  // private ArrayList<char> hand1=new ArrayList<int>();
  // private ArrayList<char> hand2=new ArrayList<int>();
  // private ArrayList<char> hand3=new ArrayList<int>();
  // private ArrayList<char> hand4=new ArrayList<int>();

  //Game constructor
  //Starts by creating the pile of pieces
  //Creates each player and their hand
  public Game(int play){
    Players = play;
    ArrayList<char> p =new ArrayList<char>();
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
    pile=p;
    for (int i = 0; i < Players; i++){
      /*Player i = new Player();//ISSUE WITH NAMING IT
      i.drawNewHand();*/
    }
    Board currentGame = new Board();
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
   public String displyNames(){
    String str = "";
    for(int i=0; i< Players;i++){//may run into same name issue as constructor
      str+= "Oliver \n";//TEMPORARY
      str+= (i* 45);
      //str+= (returnString(i)).    FIGURE OUT HOW TO REFERENCE PLAYER TO STRING
    }
    return str;
  }
}

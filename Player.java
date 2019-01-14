import java.util.*;
public class Player{
  private double Score;
  private int Size;
  private Pieces[] theHand = new Pieces[7];
  private Pieces[] toBePlayed;
  private Board Game;
  private char[] randomLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
  private int[] selection = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
  private int[] positionPlayed;
  private int[] played;
  private int[] x;
  private int[] y;
  private Random hand = new Random();
  private String name;


  //Constructor for Player(needs to be created)
  public Player(Board b){
    drawNewHand(b);
    Game = b;

  }
  public String handToString(){
    String str = "";
    for (int i = 0; i < theHand.length; i++){
      str+= theHand[i].toString();
    }
    return str;
  }
  //Prints out the players name then their score on a new line
  public String toString(){
    String str = "";
    str+=name;
    str+="\n";
    str+= Score;
    //if highest score clause
    return str;
  }

  //creates a new random hand
  //NEEDS TO BE CHANGE TO ACCOUNT FOR PILE
  public void drawNewHand(Board b){
    Pieces temp = new Pieces();
    Game = b;
    for (int i = 0; i < 7; i++){
      int len=Game.getpilelength();//add in this command
      int n = hand.nextInt(len-1);
      temp.setLetter(Game.getpile(n));
      theHand[i] = temp;
      Game.removeFromPile(n);
    }
    //return theHand;
  }

  //creates a new random piece and adds it to your hand
  //NEEDS TO BE CHANGE TO ACCOUNT FOR PILE
  public void drawNewPiece(int position){
    Pieces temp = new Pieces();
    int len=Game.getpilelength();//add in this command
    int n = hand.nextInt(len-1);
    temp.setLetter(Game.getpile(n));
    theHand[position] = temp;
    Game.removeFromPile(n);
  }

  //checks if a given piece(character) is in your hand
  public boolean inHand(char a){
    for(int i=0;i<theHand.length;i++){
      if(theHand[i].getPieceChar()==a){
        return true;
      }
    }
    return false;
  }


  //same as drawnewhand but is used as a choice for a turn
  public void replaceHand(){
    drawNewHand(Game);
    }

  //Function which takes in an input of the values selected of each piece and sets an array to be played
  public Pieces[] startTurn(){
    for (int i = 0; i < played.length; i ++){
      toBePlayed = new Pieces[played.length];
      toBePlayed[i].setLetter(randomLetters[selection[i]]);
    }
    return toBePlayed;
  }

  //Returns a value for a given character based on the real scrabble values
  public int setScoreforLetter(char L){
    int Score = 0;
    if (L=='A' || L=='E' || L=='I' || L=='O' || L=='U' || L=='L' || L=='N' || L=='S' ||L=='T' ||L=='R'){
      Score=1;
    }
    else if(L=='D' || L=='G' ){
      Score=2;
    }
    else if(L=='B' ||L=='C' ||L=='M' ||L=='P'){
      Score=3;
    }
    else if(L=='F' ||L=='H' || L=='V' || L=='W' ||L=='Y'){
      Score=4;
    }
    else if(L=='K'){
      Score=5;
    }
    else if(L=='J' || L=='X'){
      Score = 8;
    }
    else if(L=='Q' || L=='Z'){
      Score=10;
    }
    return Score;
  }

  //checks if a word played(string concatenation of characters) is in the words file
  //DOESNT ACCOUNT FOR DOWNWARD WORDS/ how the words will be played?
  public boolean isValidWord(Pieces[] p){
    p = toBePlayed;
    String word = "";
    for (int i = 0; i < p.length; i++){
      word += Character.toString(p[i].getPieceChar());
    }
    Scanner wordCheck = new Scanner("words.txt");
    while (wordCheck.hasNextLine()){
      if (word.equals(wordCheck.next())){
        return true;
      }
    }
    return false;
  }

  //uses the multiplier values and piece values to create a score gained on a run and adds it to your old score
  public double updateScore(){
    int temp = 1;
    for (int i = 0; i < toBePlayed.length; i++){
      Score += toBePlayed[i].getValue() * Game.getPieces(x[i],y[i]).getLetterMultiplier();
      if (Game.getPieces(x[i],y[i]).getWordMultiplier() > temp){
        temp = Game.getPieces(x[i],y[i]).getWordMultiplier();
      }
    }
    Score = Score * temp;
    return Score;
  }

  //If a word is valid, it gets played on the board
  //needs to check that there are overlapping letters, in scrabble it cant be floating
  public void playWord(){
    if (isValidWord(toBePlayed)){
      updateScore();
      replaceHand();
      for (int i = 0; i < x.length; i++){//needs to account for different directions
          Game.modifyBoard(x[i], y[i], toBePlayed[i].getPieceChar());
        }
      }
    }

  //prompts user to enter their name and it sets that as the name
  public void setName(){
    System.out.println("Enter your player's name:    ");
    //name = input.nextLine;
  }
  }

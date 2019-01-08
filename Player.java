import java.util.Random;
public class Player{
  private double Score;
  private int Size;
  private Pieces[] theHand = new Pieces[7];
  private Pieces[] toBePlayed;
  private Board Game;
  private char[] randomLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
  private int[] selection = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
  private Random hand = new Random();
  public Player(Board b){
    b = Game;
  }
  public Pieces[] drawHand(){
    int n = hand.nextInt(25);
    for (int i = 0; i < 7; i++){
      theHand[i] = new Pieces(randomLetters[n], setScoreforLetter(randomLetters[n]);
    }
    return theHand;
  }
  //Function which takes in an input of the values selected of each piece and sets an array to be played
  public Piece[] startTurn(){
    for (int i = 0; i < selection.length; i ++){
      toBePlayed = new Pieces[selection];
      toBePlayed[i] = randomLetters[i];
    }
  }
  public int setScoreforLetter(char L){
    int Score;
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
    else if(L=='J' L=='X'){
      Score = 8;
    }
    else if(L=='Q' || L=='Z'){
      Score=10;
    }
    return Score;
  }
}

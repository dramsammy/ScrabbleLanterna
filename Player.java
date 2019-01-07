public class Player{
  private double Score;
  private int Size;
  private Pieces theHand[] = new Pieces[7];
  private Pieces toBePlayed[];
  private Board Game;
  private char[] randomLetters = {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z};
  private int[] selection = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
  public Player(Board b){
    b = Game;
  }
  public Pieces[] drawHand(){
    //Randgen Letters 1-26
  }
  //Functio which takes in an input of the values selected of each piece and sets an array to be played
  public Piece[] startTurn(){
    for (int i = 0; i < selection.length; i ++){
      toBePlayed = new Pieces[selection];
      toBePlayed[i] = randomLetters[i];
    }
  }
}

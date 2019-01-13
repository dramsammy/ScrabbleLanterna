public class Pieces{
  private int Score;
  private char Letter;
  private String Color;
  private boolean Played;
  private int wordMultiplier;
  private int letterMultiplier;

  //basic constructor to create a blank piece
  public Pieces(){
    Letter=' ';
    Score=0;//ultimetely, reference dictionary
    Color="WHITE";//CHANGE TO WHATEVER STANDARD COLOR IS
    Played=false;
    wordMultiplier=1;
    letterMultiplier=1;
  }

  //accesor methods
  public char getPieceChar(){
    return Letter;
  }
  public int getWordMultiplier(){
    return wordMultiplier;
  }
  public int getLetterMultiplier(){
    return letterMultiplier;
  }
  public int getValue(){
    return Score;
  }
  public String getColor(){
    return Color;
  }

  //makes piece blank again
  public void clear(){
    Letter=' ';
    Color="WHITE";
    Score= 0;
  }

  //mutator methods
  //Changes the character on a piece as well as the value and Color accordingly
  public void setLetter(char L){
    Letter=L;
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
    else if(L=='J'|| L=='X'){
      Score = 8;
    }
    else if(L=='Q' || L=='Z'){
      Score=10;
    }
    Color="WHITE";
    gotplayed();
  }

  public void setColor(String c){
    Color=c;
  }
  public void setWordMultiplier(int i){
    wordMultiplier=i;
    if(i==2){
      Color="PURPLE";
    }
    else{
      Color="ORANGE";
    }
  }
  public void setLetterMultiplier(int i){
    letterMultiplier=i;
    if(i==2){
      Color="INDIGO";
    }
    else{
      Color="BLUE";
    }
  }

  //returns if a piece was played
  public boolean wasplayed(){
    return Played;
  }
  //changing it to played
  public void gotplayed(){
    Played=true;
  }
  public String toString(){
    String currscore=" ";
    String c=" ";
    Terminal.setForegroundColor(TextColor.ANSI.RED);
    if(Score!=0){
      int s=Score;
      currscore = s +"";
    }
    if(Letter!=' '){
      c+=Letter;
    }
    String str = c + "(" + currscore + ")" + "|";
    return str;
  }

}

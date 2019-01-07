public class Pieces{
  private int Score;
  private char Letter;
  private String Color;
  private boolean Played;
  private int wordMultiplier;
  private int lettermMultiplier;

  public Pieces(char Lettervalue,int Scorevalue, String Colorimput){
    Letter=Lettervalue;
    Score=Scorevalue;
    Color=Colorimput;
    Played=false;
  }
  public Pieces(char Lettervalue,int Scorevalue){
    Letter=Lettervalue;
    Score=Scorevalue;
    Color="WHITE";//CHANGE TO WHATEVER STANDARD COLOR IS
    Played=false;
  }
  public Pieces(){
    Letter=' ';
    Score=0;//ultimetely, reference dictionary
    Color="WHITE";//CHANGE TO WHATEVER STANDARD COLOR IS
    Played=false;
    wordmultiplier=1;
    lettermultiplier=1;
  }

  public String toString(){
    String str = "";
    //str += "\n";
    str += "|" + Letter + "|";
    return str;
  }
  public String getColor(){
    return Color;
  }
  public void clear(){
    Letter=' ';
    Color="WHITE";
    Score= 0;
  }
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
  public boolean wasplayed(){
    return Played;
  }
  public void gotplayed(){
    Played=true;
  }
  public int scorevalueof(char letter){
    return 0;//PUT IN 2D array of letters followed by their values. Eventually the constructors wont need score value?
  }
  public static void main(String args[]){
    Pieces a = new Pieces('R', 0);
    System.out.println(a);
  }
}

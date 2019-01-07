public class Pieces{
  int Score;
  char Letter;
  String Color;
  boolean Played;
  int wordmultiplier;
  int lettermultiplier;

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
    lettermultiplier=1
  }
  /*public String toString(){
    String str = "";
    str += "---";
    str += "\n";
    str += "|" + " " + "|";
    str += "\n";
    str += "|" + Letter + "|";
    str += "\n";
    str += "|" + Score + "|";
    str += "\n";
    str += "---";
    return str;
  }*/
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

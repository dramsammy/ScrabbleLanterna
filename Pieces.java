public class Pieces{
  int Score;
  char Letter;
  String Color;
  boolean Played;
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
    Score=0;
    Color="WHITE";//CHANGE TO WHATEVER STANDARD COLOR IS
    Played=false;
  }
  public String toString(){
    String toString = "";
    toString += "---";
    toString += "|" + char.toString
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
}

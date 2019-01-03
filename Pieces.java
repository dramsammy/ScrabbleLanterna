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
  public String toString(){
    return "" + Letter;
  }
  public String getColor(){
    return Color;
  }
  public boolean wasplayed(){
    return Played;
  }



}

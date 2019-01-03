public class Pieces{
  int Score;
  char Letter;
  String Color;
  boolean Played;
  public Pieces(char Lettervalue,int Scorevalue, String Colorimput, boolean beenplayed ){
    Letter=Lettervalue;
    Score=Scorevalue;
    Color=Colorimput;
    Played=beenplayed;
  }
  public String toString(){
    return "" + Letter;
  }
  public String getColor(){
    return Color;
  }



}

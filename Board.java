public class Board extends Pieces{
  int size;
  Pieces pieces[][];
  // Constructor for Board takes in an integer and 2D array of pieces
  public Board(int s, Pieces p[][]){
    size = s;
    pieces = p;
  }
  // Added clear method for a future restart method to be added in the game
  public void clear(){
    size = null;
    Pieces = new pieces[][];
  }
  // Accessor method for size
  public int getSize(){
    return size;
  }

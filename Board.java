import java.util.ArrayList;
public class Board extends Pieces{
  int size;
  ArrayList<Pieces> pieces = new ArrayList<Pieces>();
  // Constructor for Board takes in an integer and 2D array of pieces
  public Board(int s, ArrayList<Pieces> p){
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
  public void addPieces(Pieces p){

  }

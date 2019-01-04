import java.util.ArrayList;
public class Board extends Pieces{
  int size;
  ArrayList<Pieces> pieces = new ArrayList<Pieces>();
  Pieces[][] ary;
  // Constructor for Board takes in an integer and 2D array of pieces
  public Board(int s, ArrayList<Pieces> p, Pieces[][] a){
    size = s;
    pieces = p;
    ary = a;
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
  // Method to add pieces to array list in order to prepare to have pieces sorted randomly in Array
  public void addPiecesList(Pieces p){
    pieces.add(p);
  }

import java.util.ArrayList;
public class Board extends Pieces{
  int rows;
  int columns;
  ArrayList<Pieces> pieces = new ArrayList<Pieces>();
  ArrayList<ArrayList<Pieces>> board = new ArrayList<ArrayList<Pieces>>;
  // Constructor for Board takes in an integer and 2D ArrayList of pieces
  public Board(int r, int c, ArrayList<Pieces> p, ArrayList<ArrayList<Pieces>> a){
    rows = r;
    columns = c;
    pieces = p;
    board = a;
  }
  // Added clear method for a future restart method to be added in the game
  public void clear(){
    board.removeAll();
  }
  // Accessor method for rows
  public int getRows(){
    return rows;
  }
  // Accessor method for columns
  public int getColumns(){
    return columns;
  }
  // Method to add pieces to array list in order to prepare to have pieces sorted randomly in ArrayList
  public void addPiecesList(Pieces p){
    pieces.add(p);
  }
  // Method that will initialize the 2D ArrayList and make it a board of pieces that are blank
  public void addBlanks(){
    for (int i = 0; i < rows; i++){
      board.add(new ArrayList());
      for (int a = 0; a < columns; a++){
        board.get(i).add(Pieces(' ', 0, "white"));
      }
    }
  }
}

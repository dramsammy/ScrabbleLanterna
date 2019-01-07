import java.util.ArrayList;
public class Board extends Pieces{
  int rows;
  int columns;
  Pieces[][] board= new Pieces[15][15];
  /*ArrayList<Pieces> pieces = new ArrayList<Pieces>();
  ArrayList<ArrayList<Pieces>> board = new ArrayList<ArrayList<Pieces>>();*/
  // Constructor for Board takes in an integer and 2D ArrayList of pieces
  public Board(int r, int c, Pieces[][] a){
    rows = r;
    columns = c;
    board = a;
  }
  public static void main(String args[]){
    Pieces[][] a =new Pieces[15][15];
    Pieces r = new Pieces();
    for (int i = 0; i < a.length; i++){
      for(int l = 0; l < a[i].length; l++){
        a[i][l]=r;
      }
    }
    Board test = new Board(8, 8, a);
    System.out.println(test);
  }
  // Added clear method for a future restart method to be added in the game
  public void clear(){
    for(int i=0;i<board.length;i++){
      for(int l=0;l<board[i].length;l++){
        board[i][l]=null;
    }
  }
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
  /*public void addPiecesList(Pieces p){
    pieces.add(p);
  }*/
  // Method that will initialize the 2D ArrayList and make it a board of pieces that are blank
  /*public void addBlanks(){
    for (int i = 0; i < rows; i++){
      board.add(new ArrayList());
      for (int a = 0; a < columns; a++){
        board.get(i).add(Pieces(' ', 0, "white"));
      }
    }
  }*/
  // toString method that will display board as a 2D ArrayList of pieces
  public String toString(){
    String str = "---------------";
    for (int i = 0; i < board.length; i++){
      str+="| ";
      for(int a = 0; a < board[i].length; a++){
        str += ((board[i][a]).toString());
        //System.out.println((board[i][a]).tostring());
      }

      str += " |\n";
    }
    str += "---------------";
    return str;
  }
}

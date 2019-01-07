public class Board extends Pieces{
  public int rows;
  public int columns;
  public Pieces[][] board= new Pieces[15][15];
  // Constructor for Board takes in an integer and 2D ArrayList of pieces
  public Board(int r, int c, Pieces[][] a){
    rows = r;
    columns = c;
    board = a;
    start();
  }
  public Board(){
    rows=15;
    columns=15;
    setupboard();
  }

  public void setupboard(){
      for (int i = 0; i < 15; i++){
        for(int l = 0; l < 15; l++){
          board[i][l]= new Pieces(' ',0);
        }
      }
      board[0][0].setWordMultiplier(3);
      board[0][3].setLetterMultiplier(2);
      board[0][7].setWordMultiplier(3);
      board[0][11].setLetterMultiplier(2);
      board[0][14].setWordMultiplier(3);
      board[1][1].setWordMultiplier(2);
      board[1][5].setLetterMultiplier(3);
      board[1][9].setLetterMultiplier(3);
      board[1][13].setWordMultiplier(2);
      /*board[1][11].setLetterMultiplier(2);
      board[0][14].setWordMultiplier(3);
      board[1][1].setWordMultiplier(3);*/


  }
  public static void main(String args[]){
    Pieces[][] a =new Pieces[15][15];
    Pieces r = new Pieces(' ',0);//whatever letter you put in the '' will fill the whole board
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
/*  public int getRows(){
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
  }
  // toString method that will display board as a 2D ArrayList of pieces
  public String toString(){
    String str = "\n \n                       SCRABBLE BOARD\n";
    str+= "-----------------------------------------------------------\n";
    for (int i = 0; i < board.length; i++){
      //str+="";
      for(int a = 0; a < board[i].length; a++){
        str += ((board[i][a]).toString());
        str+= " ";
      }
      if(i<board.length-1){
        str += "\n-----------------------------------------------------------\n";
      }
    }
    str += "\n-----------------------------------------------------------";
    return str;
  }*/
}

public class Board{
  private int rows;
  private int columns;
  private Pieces[][] board= new Pieces[15][15];
  // Constructor for Board takes in an integer and 2D ArrayList of pieces
  /*public Board(int r, int c, Pieces[][] a){
    rows = r;
    columns = c;
    board = a;
    start();
  }*/
  public Board(){
    rows=15;
    columns=15;
    setupboard();
  }
  public boolean modifyBoard(int xcor, int ycor,char newval){//will start from zero
    if(board[xcor][ycor].getPieceChar()!=' '){
      return false;
    }
    else{
      board[xcor][ycor].setLetter(newval);
      return true;
    }
  }
  public Pieces getPieces(int xcor, int ycor){
    return board[xcor][ycor];
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
      board[2][2].setWordMultiplier(2);
      board[2][6].setLetterMultiplier(2);
      board[2][8].setLetterMultiplier(3);
      board[2][12].setWordMultiplier(2);
      board[3][0].setLetterMultiplier(2);
      board[3][3].setWordMultiplier(2);
      board[3][7].setLetterMultiplier(2);
      board[3][11].setWordMultiplier(2);
      board[3][14].setLetterMultiplier(2);
      board[4][4].setWordMultiplier(2);
      board[4][10].setWordMultiplier(2);
      board[5][1].setLetterMultiplier(3);
      board[5][5].setLetterMultiplier(3);
      board[5][9].setLetterMultiplier(3);
      board[5][13].setLetterMultiplier(3);
      board[6][1].setLetterMultiplier(2);
      board[6][5].setLetterMultiplier(2);
      board[6][9].setLetterMultiplier(2);
      board[6][13].setLetterMultiplier(2);
      board[7][0].setWordMultiplier(3);
      board[7][3].setLetterMultiplier(2);
      board[7][7].setLetterMultiplier(2);
      board[7][11].setLetterMultiplier(2);
      board[7][14].setWordMultiplier(3);
      board[8][1].setLetterMultiplier(2);
      board[8][5].setLetterMultiplier(2);
      board[8][9].setLetterMultiplier(2);
      board[8][13].setLetterMultiplier(2);
      board[9][1].setLetterMultiplier(3);
      board[9][5].setLetterMultiplier(3);
      board[9][9].setLetterMultiplier(3);
      board[9][13].setLetterMultiplier(3);
      board[10][4].setWordMultiplier(2);
      board[10][10].setWordMultiplier(2);
      board[11][0].setLetterMultiplier(2);
      board[11][3].setWordMultiplier(2);
      board[11][7].setLetterMultiplier(2);
      board[11][11].setWordMultiplier(2);
      board[11][14].setLetterMultiplier(2);
      board[12][2].setWordMultiplier(2);
      board[12][6].setLetterMultiplier(2);
      board[12][8].setLetterMultiplier(3);
      board[12][12].setWordMultiplier(2);
      board[13][1].setWordMultiplier(2);
      board[13][5].setLetterMultiplier(3);
      board[13][9].setLetterMultiplier(3);
      board[13][13].setWordMultiplier(2);
      board[14][0].setWordMultiplier(3);
      board[14][3].setLetterMultiplier(2);
      board[14][7].setWordMultiplier(3);
      board[14][11].setLetterMultiplier(2);
      board[14][14].setWordMultiplier(3);
    }


  /*public static void main(String args[]){
    Pieces[][] a =new Pieces[15][15];
    Pieces r = new Pieces(' ',0);//whatever letter you put in the '' will fill the whole board
    for (int i = 0; i < a.length; i++){
      for(int l = 0; l < a[i].length; l++){
        a[i][l]=r;
      }
    }
    Board test = new Board(8, 8, a);
    System.out.println(test);
  }*/
  // Added clear method for a future restart method to be added in the game
  /*public void clear(){
    for(int i=0;i<board.length;i++){
      for(int l=0;l<board[i].length;l++){
        board[i][l]=null;
    }
  }
}*/

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

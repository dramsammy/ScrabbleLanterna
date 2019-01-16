import java.util.*;
public class Board{
  private Pieces[][] board= new Pieces[15][15];
  private ArrayList<Character> pile = new ArrayList<Character>();

  //Constructor of Board. Prompts set up board method
  public Board(){
    setupboard();
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
    pile.add('A');
  }
  public int getpilelength(){
  return pile.size();
}
  public char getpile(int index){
  return pile.get(index);
}
  public void removeFromPile(int index){
  pile.remove(index);
}
  //imputs coordinates and a char and changes the board to display that char
  public boolean modifyBoard(int xcor, int ycor,char newval){//will start from zero
    if(board[xcor][ycor].getPieceChar()!=' '){
      return false;
    }
    else{
      board[xcor][ycor].setLetter(newval);
      return true;
    }
  }

  //accesor method for piece at a coordinate
  public Pieces getPieces(int xcor, int ycor){
    return board[xcor][ycor];
  }

  //creates a 15 by 15 2D array of Pieces with the correct multipliers
  public void setupboard(){
      for (int i = 0; i < 15; i++){
        for(int l = 0; l < 15; l++){
          board[i][l]= new Pieces();
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
      board[2][8].setLetterMultiplier(2);
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
      board[6][2].setLetterMultiplier(2);
      board[6][6].setLetterMultiplier(2);
      board[6][8].setLetterMultiplier(2);
      board[6][12].setLetterMultiplier(2);
      board[7][0].setWordMultiplier(3);
      board[7][3].setLetterMultiplier(2);
      board[7][7].setLetterMultiplier(2);
      board[7][11].setLetterMultiplier(2);
      board[7][14].setWordMultiplier(3);
      board[8][2].setLetterMultiplier(2);
      board[8][6].setLetterMultiplier(2);
      board[8][8].setLetterMultiplier(2);
      board[8][12].setLetterMultiplier(2);
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
      board[12][8].setLetterMultiplier(2);
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
  public boolean checkAllWords(){

  }
  public String toString(){
    String str ="";
    //str+= "          SCRABBLE 2.0       \n";
    //str+= "_______________________________\n";*/
     for (int i = 0; i < board.length; i++){
       str+="|)";
       for (int a = 0; a < board[0].length; a++){
         str+=board[i][a].toString();
       }
       if(i<board.length-1){
       }
       str+="\n";
     }
     //str+= "-------------------------------";
     return str;
  }
}

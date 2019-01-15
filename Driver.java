public class Driver{

  public static void main(String[] args){
    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Game test = new Game(3);
    Player[] list = {player1, player2, player3, player4};
    String str ="";
    for (int i = 0; i < 3; i++){
      str+= test.gameBoard.toString();
    }
    // Pieces old=test.getPieces(5,5);
    // System.out.println(old.getPieceChar());
    // System.out.println("Should Print  ");
    // System.out.println(old.getValue());
    //   System.out.println("Should Print 3 ");
    // System.out.println(old.getLetterMultiplier());
    // System.out.println(old.getWordMultiplier());
    // test.modifyBoard(5,5,'Q');
    // old=test.getPieces(5,5);
    // System.out.println(old.getPieceChar());
    // System.out.println(old.getValue());
    // System.out.println(old.getLetterMultiplier());
    // System.out.println(old.getWordMultiplier());
    // test.modifyBoard(5,5,'K');
    // old=test.getPieces(5,5);
    // System.out.println(old.getPieceChar());
    // System.out.println(old.getValue());
    // System.out.println(old.getLetterMultiplier());
    // System.out.println(old.getWordMultiplier());
    // System.out.println(test.toString());
    /*Pieces test = new Pieces();
    test.setLetter(' ');
    for (int i = 0; i < 15; i++){
      for (int a = 0; a < 15; a++){
        System.out.print(test.toString());
      }
      System.out.print("\n");
    }
    Board test1 = new Board();
    System.out.print(test1.toString());*/
    System.out.println(str);
    /*Game n = new Game();
    n.gameBoard.toString();*/





  }







}

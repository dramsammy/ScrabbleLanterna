public class Driver{

  public static void main(String[] args){
    // Board test = new Board();
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
    Pieces test = new Pieces();
    test.setLetter('C');
    for (int i = 0; i < 10; i++){
      for (int a = 0; a < 10; a++){
        System.out.print(test.toString());
      }
      System.out.print("\n");
    }





  }







}

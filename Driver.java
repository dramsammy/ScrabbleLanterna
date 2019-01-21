//USED FOR TESTING AT DIFFERENT points
//LOTS OF STUFF ADDED TESTED AND ERASED
public class Driver{
  public static void main(String[] args){
    Board b = new Board();
    b.modifyBoard(0,0,'p');
    b.modifyBoard(1,0,'l');
    b.modifyBoard(2,0,'a');
    b.modifyBoard(3,0,'y');
    b.modifyBoard(4,0,'e');
    b.modifyBoard(5,0,'r');
    b.modifyBoard(4,1,'x');
    b.modifyBoard(4,2,'t');
    b.modifyBoard(4,3,'r');
    b.modifyBoard(4,4,'a'); 

    Pieces i = new Pieces();
    Pieces l = new Pieces();
    Pieces r = new Pieces();
    Pieces t = new Pieces();
    Pieces i2 = new Pieces();
    Pieces l2 = new Pieces();
    Pieces r2 = new Pieces();
    Pieces t2= new Pieces();
    i.setLetter('a');
    l.setLetter('x');
    r.setLetter('e');
    /*t.setLetter('Y');
    i2.setLetter('e');
    l2.setLetter('r');
    r2.setLetter('a');
    t2.setLetter('Y');*/

    Pieces[] g = new Pieces[3];
    g[0] = i;
    g[1] = l;
    g[2] = r;
    //g[3] = t;
    System.out.println(b.isValidPlay(g,3,1,1));
    /*System.out.println("" +g[0].getPieceChar() +g[1].getPieceChar()+g[2].getPieceChar() + g[3].getPieceChar());
    System.out.println(b.isValidWord(g));
    /*Player test = new Player(b, "hi");
    System.out.println(test.theHandArrayList.get(0).handpiecetoString());
    System.out.println(i);
    System.out.println(test.theHandArrayList.remove(test.theHand[0]));
    String coordinates = "(a,01)";
    coordinates = coordinates.toUpperCase();
    coordinates.split(",");
    System.out.println(coordinates.charAt(1));
    System.out.println(Integer.parseInt(coordinates.substring(3,5)) == 1);*/
}
}

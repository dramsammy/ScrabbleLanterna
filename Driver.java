//USED FOR TESTING AT DIFFERENT points
//LOTS OF STUFF ADDED TESTED AND ERASED
public class Driver{
  public static void main(String[] args){
    Board b = new Board();
    Pieces i = new Pieces();
    Pieces l = new Pieces();
    Pieces r = new Pieces();
    Pieces t = new Pieces();
    i.setLetter('p');
    l.setLetter('L');
    r.setLetter('a');
    t.setLetter('Y');
    Pieces[] g = new Pieces[4];
    g[0] = i;
    g[1] = l;
    g[2] = r;
    g[3] = t;
    System.out.println("" +g[0].getPieceChar() +g[1].getPieceChar()+g[2].getPieceChar() + g[3].getPieceChar());
    System.out.println(b.isValidWord(g));
    /*Player test = new Player(b, "hi");
    System.out.println(test.theHandArrayList.get(0).handpiecetoString());
    System.out.println(i);
    System.out.println(test.theHandArrayList.remove(test.theHand[0]));*/
    String coordinates = "(a,1)";
    coordinates = coordinates.toUpperCase();
    coordinates.split(",");
    System.out.println(coordinates.charAt(1));
    System.out.println(Integer.parseInt(coordinates.substring(3,4)) == 1);
}
}

public class Driver{
  public static void main(String[] args){
    Board b = new Board();
    Player p = new Player(b, "Oliver");
    Pieces i = new Pieces();
    Pieces l = new Pieces();
    Pieces r = new Pieces();
    i.setLetter('R');
    l.setLetter('A');
    r.setLetter('N');
    Pieces[] g = new Pieces[3];
    g[0] = i;
    g[1] = l;
    g[2] = r;
    System.out.println(p.isValidWord(g));
}
}

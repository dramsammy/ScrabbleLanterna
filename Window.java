import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window extends JFrame{
  private JFrame Scrabble = new JFrame("Scrabble");
  private JPanel GameMenu = new JPanel();
  private JButton StartGame = new JButton("Start Game");
  private Pieces[][] board= new Pieces[15][15];
  private Board test = new Board(8, 8, board);
  public Window(){
    Start();

  }


  public void Start(){
    Scrabble.setSize(500,500);
    Scrabble.setLocationRelativeTo(null);
    Scrabble.setVisible(true);
    Scrabble.setDefaultCloseOperation(Scrabble.EXIT_ON_CLOSE);
    GameMenu.setBackground(Color.YELLOW);
    Begin();
    GameMenu.add(StartGame);

    Scrabble.add(GameMenu, BorderLayout.SOUTH);
  }
  public void Begin(){
    StartGame.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        System.out.println(test);
      }
    }
    );
  }

  public static void main(String[] args) {
    new Window();

  }
}

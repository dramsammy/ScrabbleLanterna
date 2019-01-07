import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window extends JFrame{
  private JFrame Scrabble = new JFrame("Scrabble");
  private JPanel GameMenu = new JPanel();
  private JButton StartGame = new JButton("Start Game");

  public Window(){
    Start();
  }


  public void Start(){
    Scrabble.setSize(500,500);
    Scrabble.setLocationRelativeTo(null);
    Scrabble.setVisible(true);
    Scrabble.setDefaultCloseOperation(Scrabble.EXIT_ON_CLOSE);
    GameMenu.setBackground(Color.YELLOW);

    GameMenu.add(StartGame);

    Scrabble.add(GameMenu, BorderLayout.SOUTH);
  }

  
  public static void main(String[] args) {
    new Window();

  }
}

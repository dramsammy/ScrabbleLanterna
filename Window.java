import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window extends JFrame{
  private JFrame Scrabble = new JFrame("Scrabble");
  private JPanel GameMenu = new JPanel();
  private JButton StartGame = new JButton("Start Game");
  private JTextField textField = new JTextField();
  private Pieces[][] board= new Pieces[15][15];
  private Board test = new Board(8, 8, board);
  private JLabel game = new JLabel();
  Graphics g;
  public Window(){
    Start();

  }


  public void Start(){
    Scrabble.setSize(1000,1000);
    Scrabble.setLocationRelativeTo(null);
    Scrabble.setVisible(true);
    Scrabble.setDefaultCloseOperation(Scrabble.EXIT_ON_CLOSE);
    GameMenu.setBackground(Color.YELLOW);
    GameMenu.setLayout(new GridLayout(9,9));
    Begin();
    GameMenu.add(StartGame);

    Scrabble.add(GameMenu);
  }


  public void Begin(){
    StartGame.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        StartGame.setVisible(false);
        GameMenu.setBackground(Color.WHITE);
        //whatever letter you put in the '' will fill the whole board
        for (int i = 0; i < board.length; i++){
          for(int l = 0; l < board[i].length; l++){
            //board[i][l]=r;
            board[i][l] = new Pieces(' ', 0);
          }
        }
        game.setText(test.toString());
        GameMenu.add(game);
      }
    }
    );
  }


  public static void main(String[] args) {
    new Window();

  }
}

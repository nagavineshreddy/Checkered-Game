import javax.swing.*;
import java.awt.*;

public class CheckeredGame extends JFrame{
    public CheckeredGame() {
        JFrame frame = new JFrame("Game of life");
        MainPanel panel = new MainPanel();
        frame.add(panel);

        frame.setSize(1700, 1700);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new CheckeredGame();
    }
}

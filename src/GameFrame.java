import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        new GamePanel();
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


}

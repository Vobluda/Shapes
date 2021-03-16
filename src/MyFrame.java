import javax.swing.*;

public class MyFrame extends JFrame {

    public MyPanel graphics;

    public MyPanel getPanel() {return graphics;}

    public MyFrame() {
        graphics = new MyPanel();
        this.setSize(1280,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(graphics);
        this.setVisible(true);
    }

}

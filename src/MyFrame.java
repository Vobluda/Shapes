import javax.swing.*;

public class MyFrame extends JFrame {

    public MyPanel graphics;

    public MyFrame(Rectangle2D rect) {
        graphics = new MyPanel(rect);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(graphics);
        this.setVisible(true);
    }

    public MyFrame(Circle2D circle) {
        graphics = new MyPanel(circle);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(graphics);
        this.setVisible(true);
    }

    public MyFrame(Line2D line) {
        graphics = new MyPanel(line);
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(graphics);
        this.setVisible(true);
    }


    public MyFrame() {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(graphics);
        this.setVisible(true);
    }

}

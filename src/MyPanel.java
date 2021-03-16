import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private Rectangle2D rect;
    private Circle2D circle;
    private Line2D line;

    public MyPanel() {}

    public MyPanel(Rectangle2D rect) {
        this.rect = rect;
    }

    public MyPanel(Circle2D circle) {
        this.circle = circle;
    }

    public MyPanel(Line2D line) {
        this.line = line;
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        if (rect != null) {
            rect.draw(g);
        } if (circle != null) {
            circle.draw(g);
        } if (line != null) {
            line.draw(g);
        }

    }
}

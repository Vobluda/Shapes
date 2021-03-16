import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    private Rectangle2D rect;
    private Circle2D circle;
    private Line2D line;
    private Shape2D curr;

    JLabel nameLabel = new JLabel();
    JButton clearButton = new JButton("Clear");

    public MyPanel() {
        setLayout(new BorderLayout());

        clearButton.setSize(new Dimension(100, 230));
        clearButton.setVisible(true);
        this.add(clearButton, BorderLayout.SOUTH);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });

        nameLabel.setSize(new Dimension(100, 200));
        nameLabel.setVisible(true);
        nameLabel.setText("Nothing... so far");
        this.add(nameLabel, BorderLayout.NORTH);
    }

    public void setCurr(Shape2D shape) {
        curr = shape;
        nameLabel.setText(curr.getName());
        repaint();
    }

    public void clear() {
        this.setCurr(new Rectangle2D(0.0,0.0,0.0,0.0));
        nameLabel.setText("Nothing... so far");
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        if (curr instanceof Rectangle2D) {
            rect = (Rectangle2D) curr;
            rect.draw(g);
        } if (curr instanceof Circle2D) {
            circle = (Circle2D) curr;
            circle.draw(g);
        } if (curr instanceof Line2D) {
            line = (Line2D) curr;
            line.draw(g);
        }

    }
}

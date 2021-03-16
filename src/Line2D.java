import java.awt.*;
import java.lang.Math;
public class Line2D extends Shape2D{
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    // 2 constructors (one no input, one full input)
    Line2D() {
        this.setName("Line");
    }

    Line2D(double inx1, double iny1, double inx2, double iny2) {
        this.setName("Line");
        this.x1 = inx1;
        this.y1 = iny1;
        this.x2 = inx2;
        this.y2 = iny2;
    }

    public double[] getPoint1() {
        double[] output = {x1, y1};
        return output;
    }

    public double[] getPoint2() {
        double[] output = {x2, y2};
        return output;
    }

    public void setBounds(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void calcLength() {
        System.out.println("Length of line: " + (Math.sqrt( (( x1 - x2 ) * ( x1 - x2 )) + (( y1 - y2 ) * ( y1 - y2 )))));
    }

    public void calcSlope() {
        System.out.println("Gradient of line: " + (( y2 - y1) / ( x2 - x1)));
    }

    public void draw(Graphics g) {
        g.drawLine((int) this.x1, (int) this.y1, (int) this.x2, (int) this.y2);
    }
}

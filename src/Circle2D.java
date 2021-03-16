import java.awt.*;
import java.lang.Math;
public class Circle2D extends Shape2D{
    private double x;
    private double y;
    private double radius;

    Circle2D() {
        this.setName("Circle");
    }

    public void setBounds(double inX, double inY, double inRadius) {
        this.x = inX;
        this.y = inY;
        this.radius = inRadius;
    }

    public boolean containsPoint(double inX, double inY) {
        boolean output = false;
        if ( Math.sqrt((( inX - x ) * ( inX - x )) + ( ( inY - y ) * ( inX - x ))) < radius) {
            output = true;
        }
        return output;
    }

    public void calcArea() {
        System.out.println("Area of circle: " + (Math.PI * ( radius * radius )));
    }

    public void calcPerimeter() {
        System.out.println("Perimeter of circle: " + ((2 * radius * Math.PI)));
    }

    public void draw(Graphics g) {
        g.drawOval((int) this.x, (int) this.y, (int) this.radius, (int) this.radius);
    }
}

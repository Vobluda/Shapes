import java.awt.*;

public class Rectangle2D extends Shape2D{
    private double x; //top left
    private double y; //top left
    private double width;
    private double height;

    Rectangle2D(){
        this.setName("Rectangle");
    }

    public double[] getBounds() { //returns 4 floats
        double[] output = {this.x, this.y, this.width, this.height};
        return output;
    }

    public void setBounds(double inX, double inY, double inWidth, double inHeight) { //takes 4 floats
        this.x = inX;
        this.y = inY;
        this.height = inHeight;
        this.width = inWidth;
    }

    public boolean containsPoint(double inX, double inY) {
        boolean output = false;
        if (( inX > x ) & ( inX < ( x + width )) & ( inY < y ) & ( inY > ( y - height ) )) {
            output = true;
        }
        return output;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void calcArea() {
        System.out.println("Area of rectangle: " + ( width * height ));
    }

    public void calcPerimeter() {
        System.out.println("Perimeter of rectangle: " + ( 2 * ( width + height ) ));
    }

    /*public int[][] returnCoordinatesInXAndY() {
        int[][] output = new int[2][4];

        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                output[0][i] = (int) this.x;
            } else {
                output[0][i] = (int) this.x + (int) this.width;
            }

            if (i % 2 == 0) {
                output[1][i] = (int) this.y;
            } else {
                output[1][i] = (int) this.y - (int) this.height;
            }
        }
    }*/

    public void draw(Graphics g) {
        g.drawRect((int) this.x, (int) this.y, (int) this.width, (int) this.height);
    }
}

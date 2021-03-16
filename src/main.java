import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ArrayList<MyFrame> frames = new ArrayList<MyFrame>();

        int inputInt = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("Hello! This program allows you to draw shapes! If you wish to escape, input -1. If you wish to proceed, input the number of the answer you wish to select.%nWould you like to:%n1) Load a shape%n2) Input a new shape%n");
        inputInt = input.nextInt();

        while (inputInt != -1) {
            if (inputInt == 1) {
                System.out.println("What is the number of the shape you wish to retrieve: ");
                inputInt = input.nextInt();
                try {
                    frames.get(inputInt - 1).setVisible(true);
                } catch(Exception e) {
                    System.out.println("That shape ID could not be found.");
                }

            } else if (inputInt == 2) {
                for (int i = 0; i < frames.size(); i++) {
                    frames.get(i).setVisible(false);
                }

                System.out.printf("You are inputting a new shape.%nWhat kind of shape:%n1) Rectangle%n2) Circle%n3) Line%n");
                inputInt = input.nextInt();

                if (inputInt == 1) {

                    Rectangle2D rect = new Rectangle2D();
                    int x;
                    int y;
                    int width;
                    int height;

                    System.out.println("What is the x coordinate of the top left of the rectangle?");
                    x = input.nextInt();

                    System.out.println("What is the y coordinate of the top left of the rectangle?");
                    y = input.nextInt();

                    System.out.println("What is the width (going towards positive x) of the rectangle?");
                    width = input.nextInt();

                    System.out.println("What is the height (going negative y) of the rectangle?");
                    height = input.nextInt();

                    rect.setBounds(x, y, width, height);
                    MyFrame myFrame = new MyFrame(rect);
                    frames.add(myFrame);

                } else if (inputInt == 2) {
                    Circle2D circle = new Circle2D();
                    int x;
                    int y;
                    int radius;

                    System.out.println("What is the x coordinate of the top left bounding point of the circle?");
                    x = input.nextInt();

                    System.out.println("What is the y coordinate of the top left bounding point of the circle?");
                    y = input.nextInt();

                    System.out.println("What is the radius of the circle?");
                    radius = input.nextInt();

                    circle.setBounds(x, y, radius);
                    MyFrame myFrame = new MyFrame(circle);
                    frames.add(myFrame);

                } else if (inputInt == 3) {
                    Line2D line = new Line2D();
                    int x1;
                    int y1;
                    int x2;
                    int y2;

                    System.out.println("What is the x coordinate of the first point of the line?");
                    x1 = input.nextInt();

                    System.out.println("What is the y coordinate of the first point of the line?");
                    y1 = input.nextInt();

                    System.out.println("What is the x coordinate of the second point of the line?");
                    x2 = input.nextInt();

                    System.out.println("What is the y coordinate of the second point of the line?");
                    y2 = input.nextInt();

                    line.setBounds(x1, y1, x2, y2);
                    MyFrame myFrame = new MyFrame(line);
                    frames.add(myFrame);
                }
                System.out.println("This shape was stored as the " + frames.size() + "th shape in storage. Use this number to reference it when loading it.");
            } else {break;}

            System.out.printf("Hello! This program allows you to draw shapes! If you wish to escape, input -1. If you wish to proceed, input the number of the answer you wish to select.%nWould you like to:%n1) Load a shape%n2) Input a new shape?%n");
            inputInt = input.nextInt();
        }
    }
}

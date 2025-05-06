import java.util.Scanner;

class Rectangle {
    double length, breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void displayArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rect1 = new Rectangle(); // Default constructor
        System.out.println("Default Constructor - Area: ");
        rect1.displayArea();

        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Rectangle rect2 = new Rectangle(length, breadth); // Parameterized constructor
        rect2.displayArea();

        sc.close();
    }
}

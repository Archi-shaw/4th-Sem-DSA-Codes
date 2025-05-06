import java.util.Scanner;

class Rectangle {
    double length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

public class DemoRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        Rectangle rect = new Rectangle(length, breadth);
        rect.calculate();

        sc.close();
    }
}

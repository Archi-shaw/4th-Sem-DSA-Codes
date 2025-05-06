import java.util.Scanner;

class AreaCalculator {
    void area(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    void area(double base, double height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();

        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        ac.area(radius);

        System.out.print("Enter base and height of Triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        ac.area(base, height);

        System.out.print("Enter side of Square: ");
        int side = sc.nextInt();
        ac.area(side);

        sc.close();
    }
}

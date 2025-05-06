import java.util.Scanner;

class Box {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return length * width * height;
    }
}

public class Boxx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        Box box = new Box(length, width, height);
        System.out.println("Volume of the box: " + box.volume());

        sc.close();
    }
}

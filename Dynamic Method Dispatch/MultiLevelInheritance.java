import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate created with dimensions: " + length + " x " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box created with dimensions: " + length + " x " + width + " x " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox created with thickness: " + thickness);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, width, height, and thickness: ");
        double l = sc.nextDouble(), w = sc.nextDouble(), h = sc.nextDouble(), t = sc.nextDouble();

        WoodBox woodBox = new WoodBox(l, w, h, t);

        sc.close();
    }
}

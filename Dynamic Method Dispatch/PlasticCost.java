import java.util.Scanner;

class Plastic2D {
    double length, width;
    final double costPerSqFt = 40;

    Plastic2D(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateCost() {
        return length * width * costPerSqFt;
    }
}

class Plastic3D extends Plastic2D {
    double height;
    final double costPerCubicFt = 60;

    Plastic3D(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double calculateCost() {
        return length * width * height * costPerCubicFt;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width for 2D sheet: ");
        double l = sc.nextDouble(), w = sc.nextDouble();

        Plastic2D sheet = new Plastic2D(l, w);
        System.out.println("Cost of 2D sheet: Rs " + sheet.calculateCost());

        System.out.print("Enter height for 3D box: ");
        double h = sc.nextDouble();

        Plastic3D box = new Plastic3D(l, w, h);
        System.out.println("Cost of 3D box: Rs " + box.calculateCost());

        sc.close();
    }
}

class Subtract {
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

public class SubtractDemo {
    public static void main(String[] args) {
        Subtract obj = new Subtract();
        System.out.println("Subtract(10, 5): " + obj.subtract(10, 5));
        System.out.println("Subtract(10.5, 4.2): " + obj.subtract(10.5, 4.2));
        System.out.println("Subtract(20, 5, 3): " + obj.subtract(20, 5, 3));
    }
}

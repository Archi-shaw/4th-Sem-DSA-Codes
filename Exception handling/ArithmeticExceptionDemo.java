import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int num = sc.nextInt();
        System.out.print("Enter denominator: ");
        int denom = sc.nextInt();

        try {
            int result = num / denom; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed.");
        }
        sc.close();
    }
}

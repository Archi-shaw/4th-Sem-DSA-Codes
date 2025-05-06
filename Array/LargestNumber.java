import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        int largest = Math.max(num1, Math.max(num2, num3));

        System.out.println("Largest Number: " + largest);
        sc.close();
    }
}

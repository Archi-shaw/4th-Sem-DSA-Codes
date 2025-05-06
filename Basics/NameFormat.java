import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Formatted Name: " + lastName + " " + firstName);

        scanner.close();
    }
}

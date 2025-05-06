import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int dayNo = scanner.nextInt();

        switch (dayNo) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day number! Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}

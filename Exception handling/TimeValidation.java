import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

public class TimeValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter hours: ");
            int hours = sc.nextInt();
            if (hours < 0 || hours > 24) throw new HrsException("Hour is not valid");

            System.out.print("Enter minutes: ");
            int minutes = sc.nextInt();
            if (minutes < 0 || minutes > 60) throw new MinException("Minutes are not valid");

            System.out.print("Enter seconds: ");
            int seconds = sc.nextInt();
            if (seconds < 0 || seconds > 60) throw new SecException("Seconds are not valid");

            System.out.println("Correct Time -> " + hours + ":" + minutes + ":" + seconds);

        } catch (HrsException | MinException | SecException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        sc.close();
    }
}

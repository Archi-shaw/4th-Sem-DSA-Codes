import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: Rs " + balance);
    }
}

class Person extends Account {
    String name, aadhar_no;

    @Override
    void input(Scanner sc) {
        super.input(sc);
        sc.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
    }

    @Override
    void disp() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            persons[i].input(sc);
        }

        System.out.println("\nDisplaying details of 3 persons:");
        for (Person person : persons) {
            person.disp();
        }

        sc.close();
    }
}

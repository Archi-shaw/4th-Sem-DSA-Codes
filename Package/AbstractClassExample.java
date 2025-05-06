import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;

    void getInput(int rollNo, long regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void display() {
        System.out.println("Roll No - " + rollNo);
        System.out.println("Registration No - " + regNo);
        course();
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        System.out.print("Enter Registration No: ");
        long regNo = sc.nextLong();

        Kiitian student = new Kiitian();
        student.getInput(rollNo, regNo);
        student.display();

        sc.close();
    }
}

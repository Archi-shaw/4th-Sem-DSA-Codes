import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Roll No: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];
        double minCgpa = Double.MAX_VALUE;
        String lowestCgpaStudent = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter CGPA: ");
            double cgpa = sc.nextDouble();

            students[i] = new Student(roll, name, cgpa);
            if (cgpa < minCgpa) {
                minCgpa = cgpa;
                lowestCgpaStudent = name;
            }
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }

        System.out.println("Student with Lowest CGPA: " + lowestCgpaStudent);

        sc.close();
    }
}

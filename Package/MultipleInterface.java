import java.util.Scanner;

interface Employee {
    void getDetails(int empId, String empName);
}

interface Manager extends Employee {
    void getDeptDetails(int deptId, String deptName);
}

class Head implements Manager {
    int empId, deptId;
    String empName, deptName;

    public void getDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void getDeptDetails(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    void display() {
        System.out.println("Employee ID - " + empId);
        System.out.println("Employee Name - " + empName);
        System.out.println("Department ID - " + deptId);
        System.out.println("Department Name - " + deptName);
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Department ID: ");
        int deptId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department Name: ");
        String deptName = sc.nextLine();

        Head head = new Head();
        head.getDetails(empId, empName);
        head.getDeptDetails(deptId, deptName);
        head.display();

        sc.close();
    }
}

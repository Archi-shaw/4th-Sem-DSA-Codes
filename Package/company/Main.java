import java.util.Scanner;
import Marketing.Sales;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        Sales salesPerson = new Sales(empId, empName, basicSalary);
        salesPerson.displayEarnings();

        sc.close();
    }
}

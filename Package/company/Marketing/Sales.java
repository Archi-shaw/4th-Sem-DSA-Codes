package Marketing;
import General.Employee;

public class Sales extends Employee {
    public Sales(int empId, String empName, double basicSalary) {
        super(empId, empName, basicSalary);
    }

    public double tallowance() {
        return 0.05 * earnings();
    }

    public void displayEarnings() {
        double totalEarnings = earnings();
        System.out.println("The emp id of the employee is " + empId);
        System.out.println("The total earning is " + (totalEarnings + tallowance()));
    }
}

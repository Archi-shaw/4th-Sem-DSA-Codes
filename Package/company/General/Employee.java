package General;

public class Employee {
    protected int empId;
    private String empName;
    protected double basicSalary;

    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public double earnings() {
        return basicSalary + (0.8 * basicSalary) + (0.15 * basicSalary);
    }
}

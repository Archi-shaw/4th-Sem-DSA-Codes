import java.util.Scanner;

interface Salary {
    double earnings();
    double deductions();
    double bonus();
}

class Manager implements Salary {
    double basicSalary;

    Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double earnings() {
        return basicSalary + (0.8 * basicSalary) + (0.15 * basicSalary);
    }

    public double deductions() {
        return 0.12 * basicSalary;
    }

    public double bonus() {
        return 0; 
    }
}

class Substaff extends Manager {
    Substaff(double basicSalary) {
        super(basicSalary);
    }

    @Override
    public double bonus() {
        return 0.5 * basicSalary;
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Substaff emp = new Substaff(basic);
        System.out.println("Earnings - " + emp.earnings());
        System.out.println("Deduction - " + emp.deductions());
        System.out.println("Bonus - " + emp.bonus());

        sc.close();
    }
}

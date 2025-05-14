import java.util.Scanner;

    class Employee {
    public String firstName;
    public String lastName;
    public double monthlySalary;

    public void getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter employee's last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter employee's monthly salary: ");
        monthlySalary = scanner.nextDouble();
    }

    public void setEmployeeDetails() {
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("Yearly Salary: $" + getYearlySalary());
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        monthlySalary += monthlySalary * (10 / 100.0);
    }
}

     class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        System.out.println("Enter details for first employee:");
        emp1.getEmployeeDetails();

        System.out.println("Enter details for second employee:");
        emp2.getEmployeeDetails();

        emp1.setEmployeeDetails();
        emp2.setEmployeeDetails();

        emp1.giveRaise();
        emp2.giveRaise();

        System.out.println("After 10% Raise:");
        emp1.setEmployeeDetails();
        emp2.setEmployeeDetails();
    }
}

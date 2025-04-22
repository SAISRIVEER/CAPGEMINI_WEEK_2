public class Employee {
    public String employeeID;
    protected String department;
    private double salary;
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
    public void updateSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated successfully to: $" + this.salary);
        } else {
            System.out.println("Invalid salary amount. Salary must be greater than 0.");
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: $" + this.salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerInfo() {
        System.out.println("\n--- Manager Information ---");
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + getSalary());

        System.out.println("Team Size: " + teamSize);
    }
    public void changeDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.println("Department changed to: " + this.department);
    }

    public static void main(String[] args) {

        Employee emp = new Employee("E001", "IT", 50000);
        System.out.println("--- Employee Information ---");
        emp.displayEmployeeInfo();
        emp.updateSalary(55000);
        emp.displayEmployeeInfo();
        Manager mgr = new Manager("M001", "Finance", 80000, 5);
        mgr.displayManagerInfo();

        mgr.changeDepartment("Operations");
        mgr.displayManagerInfo();
        mgr.updateSalary(85000);
        mgr.displayManagerInfo();
        System.out.println("\nDirectly accessing public field:");
        System.out.println("Manager ID: " + mgr.employeeID);
        mgr.updateSalary(-1000);
    }
}

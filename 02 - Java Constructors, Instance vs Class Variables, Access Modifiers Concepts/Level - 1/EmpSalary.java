class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
class Manager extends Employee {
    void display() {
        System.out.println("ID: " + employeeID + ", Department: " + department);
    }
    void showSalary() {
        System.out.println("Salary: $" + getSalary());
    }
}
class EmployeeRecords {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.employeeID = 16;
        manager.department = "BA";
        manager.setSalary(450000);
        manager.display();
        manager.showSalary();
    }
}

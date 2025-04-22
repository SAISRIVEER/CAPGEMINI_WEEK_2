interface department{
    void assignDepartment(String department);
    String getDepartmentDetails();

}

abstract class Employee implements department {
    private String employeeID;
    private String name;
    private double salary;
    private String departmnet;

    public Employee(String employeeID, String name, double salary,String department) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.departmnet=department;
    }

    abstract double claculateSalary();

    void displayDetails(){
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Name: "+name);
        System.out.println("salary: "+salary);
        System.out.println("Department: "+departmnet);
    }

    @Override
    public void assignDepartment(String department) {
        this.departmnet=department;
    }

    @Override
    public String getDepartmentDetails(){
        return departmnet;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String employeeID, String name, double salary, String department) {
        super(employeeID, name, salary, department);
    }

    @Override
    public double claculateSalary(){
        return getSalary();
    }
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double Salary, String department, double hourlyRate, int hoursWorked) {
        super(id, name, Salary, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double claculateSalary() {
        return (hourlyRate * hoursWorked) + getSalary();
    }

    // Additional getters/setters for part-time specific fields
    public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int hours) { hoursWorked = hours; }
    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double rate) { hourlyRate = rate; }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create employees
        Employee fullTime = new FullTimeEmployee("FT001", "Alice Smith", 5000,"CSE");
        fullTime.assignDepartment("Engineering");

        Employee partTime = new PartTimeEmployee("PT001", "Bob Johnson", 1000,"CSE", 20, 80);
        partTime.assignDepartment("Support");

        // Create employee list
        Employee[] employees = {fullTime, partTime};

        // Process employees polymorphically
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("-------------------");
        }
    }
}

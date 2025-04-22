public class Employee {
    String name;
    String id;
    double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display(){
        System.out.println("\nName: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee{
    int teamsize;

    public Manager(String name, String id, double salary, int teamsize) {
        super(name, id, salary);
        this.teamsize = teamsize;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Team Size: "+teamsize);
    }
}
class Developer extends Employee{
    String programmingLanguage;

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Programing Language: "+programmingLanguage);
    }
}
class Intern extends Employee{
    int duration;

    public Intern(String name, String id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Duration of period: "+duration);
    }
}

class emp{
    public static void main(String[] args) {
        Employee e=new Employee("Jhon","53A1R",500000);
        Manager m=new Manager("Alice","41R8A6",1000000,4);
        Developer d=new Developer("Lisa","54G9O6",702461,"Java");
        Intern i=new Intern("Rohit","75F0P",25000,3);

        e.display();
        m.display();
        d.display();
        i.display();
    }
}


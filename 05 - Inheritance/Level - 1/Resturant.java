interface Worker {
    void performDuties();
}
class Person1 {
    String name;
    int id;
    Person1(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking food.");
    }
}
class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving food.");
    }
}
public class Resturant {
    public static void main(String[] args) {
        Worker chef = new Chef("Resh", 101);
        Worker waiter = new Waiter("Karan", 102);
        chef.performDuties();
        waiter.performDuties();
    }
}

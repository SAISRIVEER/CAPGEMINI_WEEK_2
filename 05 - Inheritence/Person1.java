public class Person1 {

    String name;
    String id;

    public Person1(String name, String id) {
        this.name = name;
        this.id = id;
    }

    void Display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}

interface worker{
    void perfornmDuties();
}

class Chef extends Person1 implements worker{

    public Chef(String name, String id) {
        super(name, id);
    }

    @Override
    public void perfornmDuties() {
        System.out.println("chef "+name+" is making food");
    }
}

class Waiter extends Person1 implements worker{
    public Waiter(String name, String id) {
        super(name, id);
    }

    @Override
    public void perfornmDuties() {
        System.out.println("Waiter "+name+" takes order");
    }
}

class Pers{
    public static void main(String[] args) {
        Chef p=new Chef("Harry","414");
        Waiter p2=new Waiter("Badri","581");

        p.perfornmDuties();
        p2.perfornmDuties();

    }
}

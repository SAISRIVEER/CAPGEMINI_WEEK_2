public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal Sounds");
    }

    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age+" years");
    }
}
class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Dog sound: Bow");
    }

    @Override
    void Display(){
        super.Display();
    }
}
class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println("Cat sounds: Meow");
    }

    @Override
    void Display(){
        super.Display();
    }
}
class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Bird sounds: CuCu");
    }
    @Override
    void Display(){
        super.Display();
    }
}
class main{
    public static void main(String[] args) {
        Animal a1=new Animal("Zebra",2);
        Dog d=new Dog("coco",1);
        Cat c=new Cat("ferro",1);
        Bird b=new Bird("catti",1);
        a1.makeSound();
        a1.Display();
        d.makeSound();
        d.Display();
        c.makeSound();
        c.Display();
        b.makeSound();
        b.Display();
    }
}

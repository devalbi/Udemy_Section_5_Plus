package devalbi.udemy.section_6_classes.work.class_basics.inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(1, 1, 5, 5, "Animal");
        Dog dog = new Dog(8, 2, "Bonnie", 2, 4, 1, 20, "Golden");

        //Dog inherits this method from Animal
        //dog.eat();
        dog.run();
       // dog.walk();
    }
}

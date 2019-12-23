package devalbi.udemy.section_7_oop_2.challenges.polymorphism;

public class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }

    public static void foo() {
        System.out.println("Animal");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    public static void foo() {  // hides Animal.foo()
        System.out.println("Cat");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal myAnimal2 = new Animal();

        //Static method hiding, uses referenced class (LHS)
        //My
        myAnimal2.testClassMethod();
        myAnimal.testClassMethod();
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        myCat.testClassMethod();


        ///Other way of showing
        Animal.foo(); // prints Animal
        Cat.foo(); // prints Cat

        Animal a = new Animal();
        Animal b = new Cat();
        Cat c = new Cat();
        Animal d = null;

        a.foo(); // should not be done. Prints Animal because the declared type of a is Animal
        b.foo(); // should not be done. Prints Animal because the declared type of b is Animal
        c.foo(); // should not be done. Prints Cat because the declared type of c is Cat
        d.foo(); // should not be done. Prints Animal because the declared type of d is Animal
    }
}


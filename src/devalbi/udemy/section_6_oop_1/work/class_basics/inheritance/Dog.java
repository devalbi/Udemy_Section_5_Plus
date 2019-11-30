package devalbi.udemy.section_6_oop_1.work.class_basics.inheritance;

public class Dog extends Animal{

    //Fields seperate to the inherited fields from super/parent class.
    private int eyes, legs, tail, teeth;
    private String coat;
    /*Super/Parent and sub/child classes must have default constructor available.
    super() - calls constructor of parent class
    Input params in constructor are generated straight from Animal constructor*/
    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        //super(brian, body, size, weight, name);
        //Can remove some input params and hardcode IF we know they will always be the same
        // (Body and brain removed from Animal Constructor)
        //Must be included in Super though.
        super(1, 1, size, weight, name);

        //Dog unique fields
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override // states that this is overriding super/parent's class.
    public void eat() {
        System.out.println("dog.eat called"); // Part of Dog Classes' overiding method from Animal.eat()
        chew(); //Calls another method from Same Dog class
        super.eat(); //Calls Super/Parent classes's method using Keyword Super
    }

    private void chew(){
        System.out.println("Dog.chew() called.");
    }
    public void run(){
        System.out.println("dog.run() called.");
        move(10);
    }

    public void walk(){
        System.out.println("dog.walk() called.");
        move(5);
        super.move(5); // good idea to use super if want parent class. Incase move is created in sub/child class in the future.
    }

    public void moveLegs(int speed){
        System.out.println("dog.moveLegs() called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}

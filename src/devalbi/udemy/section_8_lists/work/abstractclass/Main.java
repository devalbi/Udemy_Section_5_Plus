package devalbi.udemy.section_8_lists.work.abstractclass;

import devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats.Patty;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("dog");
        dog.breath();
        dog.eat();


        Parrot parrot = new Parrot("Budgy");
        parrot.eat();
        parrot.breath();


        Penguin penguin = new Penguin("Budgy");
        penguin.eat();
        penguin.breath();
        penguin.fly();
    }
}

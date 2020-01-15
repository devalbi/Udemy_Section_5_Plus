package devalbi.udemy.section_8_lists.work.abstractclass;


/*Extends for abstractchallenge, not implement*/

public class Dog extends Animal {



    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        /*getName() from Abstract class animal*/
        System.out.println(getName() + " eating");

    }

    @Override
    public void breath() {
        System.out.println(getName() + " breathing");
    }
}

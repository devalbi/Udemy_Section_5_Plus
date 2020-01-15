package devalbi.udemy.section_8_lists.work.abstractclass;

public abstract class Animal {

    /*Can add fields,
    * Have concrete methods + abstractchallenge methods*/
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
}

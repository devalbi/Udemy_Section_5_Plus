package devalbi.udemy.section_6_classes.work.class_basics.inheritance;

public class Animal {
    private int brian, body, size, weight;
    private String name;

    public Animal(int brian, int body, int size, int weight, String name) {
        this.brian = brian;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    //As public(Also protected or default if subclass is in same package)
    //Sub/Child classes can inherit these methods.
    public void eat(){
        System.out.println("Animal.eat() called.");
    }
    public void move(int speed){
        System.out.println("Animal moves at " + speed + " speed.");
    }

    public int getBrian() {
        return brian;
    }

    public void setBrian(int brian) {
        this.brian = brian;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

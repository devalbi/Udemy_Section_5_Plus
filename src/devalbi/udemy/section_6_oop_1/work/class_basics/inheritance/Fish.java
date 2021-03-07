package devalbi.udemy.section_6_oop_1.work.class_basics.inheritance;

public class Fish extends Animal{
    private int gills, fins, eyes;

    public Fish(int brian, int body, int size, int weight, String name, int gills, int fins, int eyes) {
        super(brian, body, size, weight, name);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }
    private void rest(){
    }

    private void moveMuscles(){}
    private void moveBackFin(){}

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }


}
////Covariant return types
/*
    public class burger{
        //Do Something
            }
    public class HealthyBurger extends burger{
        //do somthing
    }

    //method used to call/create burger objects
    public class BurgerFactory {
        public Hamburger createBurger() {
            return new Hamburger();
        }
    }

    public class HealthyBurgerFactory{
        //method overriding using subclass or subvariant or covariant return type \
        //is healthyBurger as it is a subclass of Hamburger
        public HealthyBurger createBurger(){
            return new HealthyBurger();
        }
}*/

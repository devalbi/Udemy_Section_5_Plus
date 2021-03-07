package devalbi.udemy.section_7_oop_2.challenges.oopFinal;

public class Main {

    public static void main(String[] args) {
        //String patty, String bun, double price, String name
/*        Hamburger burger = new Hamburger("chicken", "white", 10.00d, "BurgerPatty");
        burger.inputIngredient();

        Hamburger burger1 = new Hamburger();

        burger1.inputIngredient();*/

/*        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.inputIngredient();
        System.out.println(healthyBurger.getBurgerDetails());*/

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.getBurgerDetails());

    }
}

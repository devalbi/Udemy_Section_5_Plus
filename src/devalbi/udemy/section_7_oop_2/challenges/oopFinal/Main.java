package devalbi.udemy.section_7_oop_2.challenges.oopFinal;

public class Main {

    public static void main(String[] args) {
        //String patty, String bun, double price, String name
/*        Burger burger = new Burger("chicken", "white", 10.00d, "Hamburger");
        burger.inputIngredient();

        Burger burger1 = new Burger();

        burger1.inputIngredient();*/

/*        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.inputIngredient();
        System.out.println(healthyBurger.getBurgerDetails());
        System.out.println(healthyBurger.getHealthyBurgerDetails());*/

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(deluxeBurger.getBurgerDetails());

    }
}

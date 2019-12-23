package devalbi.udemy.section_7_oop_2.challenges.oopFinal;

import devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats.Beef;

public class Main {

    public static void main(String[] args) {
        //String patty, String bun, double price, String name
        Burger burger = new Burger("chicken", "white", 10.00d, "Hamburger");
        burger.InputIngredient();

        Burger burger1 = new Burger();

        burger1.InputIngredient();

    }
}

package devalbi.udemy.section_7_oop_2.challenges.oopFinal;

import devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun.Bun;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun.WhiteBun;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.dulexe.Drink;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.dulexe.Fries;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats.Chicken;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats.Patty;

public class DeluxeBurger extends Burger{

    private Fries fries;
    private Drink drink;
    private Bun bun;
    private Patty patty;
    private String deluxeBurgerDetail = "";

    public DeluxeBurger(String patty, String bun, double price, String name, Fries fries, Drink drink) {
        super(patty, bun, price, name);
        this.fries = fries;
        this.drink = drink;
    }

    public DeluxeBurger(double price, String name, Fries fries, Drink drink) {
        super(price, name);
        this.fries = fries;
        this.drink = drink;
    }

    public DeluxeBurger() {
        setPrice(12.00d);
        setName("Deluxe Burger");
        this.fries = new Fries();
        this.drink = new Drink("Pepsi");
        this.bun = new WhiteBun();
        this.patty = new Chicken();
    }

    @Override
    public String getBurgerDetails() {
           deluxeBurgerDetail = "You have ordered a " +getName() +
                   " on a " + bun.getName() + ", with " + fries.getName() +
                   " and a drink, " + drink.getFlavour() + "." +
                   "The final price is: $" + getPrice();
           return deluxeBurgerDetail;
    }

    @Override
    public void addIngredient(String option) {
        System.out.println("You cannot add items to the deluxe burger.");
    }
}
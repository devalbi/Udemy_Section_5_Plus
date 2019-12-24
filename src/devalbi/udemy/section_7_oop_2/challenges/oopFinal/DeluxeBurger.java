package devalbi.udemy.section_7_oop_2.challenges.oopFinal;

import devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun.Bun;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.dulexe.Drink;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.dulexe.Fries;
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

    public DeluxeBurger(Fries fries, Drink drink) {
        this();
        this.fries = fries;
        this.drink = drink;
    }

    public DeluxeBurger() {
        super("Chicken", "White", 12.00d, "Deluxe Burger");
        this.fries = new Fries();
        this.drink = new Drink("Pepsi");
    }

    @Override
    public String getBurgerDetails() {
           deluxeBurgerDetail = "You have ordered a " +getName() +
                   ", with a "+ super.getPattyName() +" patty on a " + super.getBunName() + ", with " + fries.getName() +
                   " and a drink, " + drink.getFlavour() + "." +
                   "The final price is: $" + getPrice();
           return deluxeBurgerDetail;
    }

    //As per requirements, need to ensure Deluxe Burger cannot order additional items.
    //Doing this by overriding the inputIngredient() method with a print out.
    @Override
    public void inputIngredient() {
        System.out.println("You cannot add items to the deluxe burger.");
    }
}
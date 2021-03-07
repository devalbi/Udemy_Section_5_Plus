package devalbi.udemy.section_7_oop_2.challenges.oopfinal2.Burger.impl;

import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.Burger.IHamBurger;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.bun.Basebun;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.fillings.BaseFilling;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.meat.BurgerPatty;

import java.util.ArrayList;
import java.util.List;

public class Hamburger implements IHamBurger {

    private Basebun bun;
    private BurgerPatty patty;
    private double priceTotal;
    protected List<BaseFilling> fillings;



    public Hamburger() {
        this.bun = new Basebun();
        this.patty = new BurgerPatty();
        this.priceTotal = 10.00;
        fillings = new ArrayList<>();
    }

    public Hamburger(Basebun bun, BurgerPatty patty, Double priceTotal) {
        this.bun = bun;
        this.patty = patty;
        this.priceTotal = priceTotal;
        fillings = new ArrayList<>();
    }

    public List<BaseFilling> getFillings() {
        return fillings;
    }

    public void addFiling(BaseFilling filling) {
        BaseFilling newFilling = filling;
        if(fillings.size() < 4) {
            fillings.add(filling);
        } else {
            System.out.println("You cannot add more fillings");
        }
    }

    public double calculateTotalPrice() {
        for (int i = 0; i < fillings.size(); i++) {
            System.out.println("Adding " + fillings.get(i).getFillingName() + " to the burger for $" + fillings.get(i).getCost());
            priceTotal += fillings.get(i).getCost();
        }
        System.out.println("Total price of burger is now: $" + this.priceTotal);
        return priceTotal;
    }

}

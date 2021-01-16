package devalbi.udemy.section_7_oop_2.challenges.oopfinal2;

import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.bun.Bun;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.fillings.BaseFilling;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.meat.Hamburger;

import java.util.Arrays;

public class Burger {

    private Bun bun;
    private Hamburger hamburger;
    private double priceTotal;
    private BaseFilling filling1;
    private BaseFilling filling2;
    private BaseFilling filling3;
    private BaseFilling filling4;
    private BaseFilling fillings[];

    public Burger(BaseFilling filling1) {
        this();
        this.filling1 = filling1;
        fillings = new BaseFilling[]{filling1};
    }

    public Burger(BaseFilling filling1, BaseFilling filling2) {
        this();
        this.filling1 = filling1;
        this.filling2 = filling2;
        fillings = new BaseFilling[]{filling1, filling2};
    }

    public Burger(BaseFilling filling1, BaseFilling filling2, BaseFilling filling3) {
        this();
        this.filling1 = filling1;
        this.filling2 = filling2;
        this.filling3 = filling3;
        fillings = new BaseFilling[]{filling1, filling2, filling3};
    }

    public Burger(BaseFilling filling1, BaseFilling filling2, BaseFilling filling3, BaseFilling filling4) {
        this();
        this.filling1 = filling1;
        this.filling2 = filling2;
        this.filling3 = filling3;
        this.filling4 = filling4;
        fillings = new BaseFilling[]{filling1, filling2, filling3, filling4};
    }

    public Burger() {
        this.bun = new Bun();
        this.hamburger = new Hamburger();
        this.priceTotal = 10.00;
    }

    public Burger(Bun bun, Hamburger hamburger, double priceTotal, BaseFilling filling1, BaseFilling filling2, BaseFilling filling3, BaseFilling filling4) {
        this.bun = bun;
        this.hamburger = hamburger;
        this.priceTotal = priceTotal;
        this.filling1 = filling1;
        this.filling2 = filling2;
        this.filling3 = filling3;
        this.filling4 = filling4;
        fillings = new BaseFilling[]{filling1, filling2, filling3, filling4};
    }

    public double calculateTotalPrice() {
        for (int i = 0; i < fillings.length; i++) {
            System.out.println("Adding " + fillings[i].getFillingName() + " to the burger for $" + fillings[i].getCost());
            priceTotal += fillings[i].getCost();
        }
        System.out.println("Total price of burger is now: $" + this.priceTotal);
        return priceTotal;
    }

}

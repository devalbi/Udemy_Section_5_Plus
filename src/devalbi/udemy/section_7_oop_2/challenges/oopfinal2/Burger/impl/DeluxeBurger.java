package devalbi.udemy.section_7_oop_2.challenges.oopfinal2.Burger.impl;

import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.Burger.IHamBurger;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.bun.Basebun;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.extras.Drink;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.extras.ExtraBase;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.extras.Fries;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.meat.BurgerPatty;

public class DeluxeBurger extends Hamburger implements IHamBurger {

    private ExtraBase extraBase1;
    private ExtraBase extraBase2;


    public DeluxeBurger() {
        super();
        extraBase1 = new Fries();
        extraBase2 = new Drink();
    }

    public DeluxeBurger(Basebun bun, BurgerPatty patty, double pricetotal) {
        super(bun, patty, pricetotal);
        extraBase1 = new Fries();
        extraBase2 = new Drink();
    }

}

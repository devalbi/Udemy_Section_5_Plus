package devalbi.udemy.section_7_oop_2.challenges.oopfinal2.Burger.impl;

import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.Burger.IHamBurger;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.bun.Basebun;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.fillings.BaseFilling;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.meat.BurgerPatty;

public class HealthyBurger extends Hamburger implements IHamBurger {



    public HealthyBurger(Basebun bun, BurgerPatty patty, double priceTotal) {
        super(bun, patty, priceTotal);
    }

    @Override
    public void addFiling(BaseFilling filling) {
        BaseFilling newFilling = filling;
        if(super.fillings.size() < 6) {
            fillings.add(filling);
        } else {
            System.out.println("You cannot add more fillings");
        }
    }
}

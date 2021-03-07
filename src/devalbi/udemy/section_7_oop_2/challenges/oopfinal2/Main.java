package devalbi.udemy.section_7_oop_2.challenges.oopfinal2;

import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.Burger.impl.DeluxeBurger;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.Burger.impl.Hamburger;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.Burger.impl.HealthyBurger;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.bun.Basebun;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.bun.RyeBun;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.fillings.*;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.meat.BurgerPatty;

public class Main {


    public static void main(String[] args) {

        BurgerPatty patty = new BurgerPatty();
        Basebun bun =  new Basebun();
        Basebun ryeBun = new RyeBun();
        BaseFilling lettuce = new Lettuce();
        BaseFilling tomato = new Tomato();
        BaseFilling onions = new Onions();
        BaseFilling cheese = new Cheese();
        BaseFilling sweetcorn = new Sweetcorn();
        BaseFilling avacado = new Avacado();


        Hamburger burger =  new Hamburger(bun, patty, 10.00);
        burger.addFiling(lettuce);
        burger.addFiling(tomato);
        burger.addFiling(cheese);
        burger.addFiling(cheese);
//
        burger.calculateTotalPrice();
//        burger1.calculateTotalPrice();
//
        Hamburger healthyBurger =  new HealthyBurger(ryeBun, patty, 10.00);
        healthyBurger.addFiling(lettuce);
        healthyBurger.addFiling(tomato);
        healthyBurger.addFiling(onions);
        healthyBurger.addFiling(cheese);
        healthyBurger.addFiling(avacado);
        healthyBurger.addFiling(sweetcorn);
        healthyBurger.addFiling(sweetcorn);
        healthyBurger.calculateTotalPrice();

        Hamburger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addFiling(lettuce);
        deluxeBurger.addFiling(tomato);
        deluxeBurger.addFiling(onions);
        deluxeBurger.calculateTotalPrice();

    }
}

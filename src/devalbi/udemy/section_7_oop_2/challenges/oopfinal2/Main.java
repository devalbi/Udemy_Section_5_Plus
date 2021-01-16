package devalbi.udemy.section_7_oop_2.challenges.oopfinal2;

import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.Burger;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.bun.Bun;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.fillings.*;
import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.meat.Hamburger;

public class Main {


    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger();
        Bun bun =  new Bun();
        BaseFilling lettuce = new Lettuce();
        BaseFilling tomato = new Tomato();
        BaseFilling onions = new Onions();
        BaseFilling cheese = new Cheese();
        BaseFilling sweetcorn = new Sweetcorn();
        BaseFilling avacado = new Avacado();




        Burger burger =  new Burger(bun, hamburger, 10.00, lettuce, tomato, onions, cheese);
        Burger burger1 =  new Burger(onions, avacado, cheese);

        burger.calculateTotalPrice();
        burger1.calculateTotalPrice();


    }
}

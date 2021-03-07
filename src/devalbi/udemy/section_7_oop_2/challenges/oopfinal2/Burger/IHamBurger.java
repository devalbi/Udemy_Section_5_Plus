package devalbi.udemy.section_7_oop_2.challenges.oopfinal2.Burger;

import devalbi.udemy.section_7_oop_2.challenges.oopfinal2.fillings.BaseFilling;

import java.util.List;

public interface IHamBurger {

    public List<BaseFilling> getFillings();

    public void addFiling(BaseFilling filling);

    public double calculateTotalPrice();


}

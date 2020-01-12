package devalbi.udemy.section_9_abstraction.work.interfaces;

import devalbi.udemy.section_7_oop_2.challenges.oopFinal.DeluxeBurger;

public class Main {

    public static void main(String[] args) {

    /*This is not valid as interface has no constructor.
    ITelephone iPhone = new ITelephone(123456);*/

    ITelephone iPhone;
    //DeskPhone iPhone; can use this instead.
    iPhone = new DeskPhone(1234567);
    iPhone.powerOn();
    iPhone.callPhone(1234567);
    iPhone.answer();


    /*Can use Iphone with datatype of interface for any class that implements it
    * Would not have worked if reference had the datatype of Deskphone, as it and mobile phone are not related.*/
    iPhone = new MobilePhone(245654);
    iPhone.powerOn();
    iPhone.callPhone(245654);
    iPhone.answer();
    }

}

package devalbi.udemy.section_9_abstraction.work.innner;

import devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun.Bun;

import javax.swing.*;
import java.util.Scanner;

public class Main{

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    /*
    Moved above for easier reading
    method to simulate button being clicked*/
    public static void listen(){
        boolean quit = false;
        while(!quit){
            int choice =  scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit= true;
                    break;
                case 1:

                    //Step 4 -  calls Button class onClick Method. See Button class
                    btnPrint.onClick();
                    break;
            }
        }
    }

    public static void main(String[] args) {

        /*Anonymous class example*/

        btnPrint.setOnClickListnner(new Button.OnclickListener() {

            //class has no name and implemented in the method
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });
        listen();

        /*This is still local as it is written inside Main METHOD
        * It implements interface from button class which is also an inner class (interface, not button)
        * But reason it is an local inner class as it is written in */
/*      Local Class Example
        class ClickListener implements Button.OnclickListener{
            *//*Constructor*//*
            public ClickListener(){
                System.out.println("Button Attached");
            }

            @Override
            public void onClick(String title) {

                //Step 6 - calls this class.
                System.out.println(title + " was clicked");
            }

        }

        //Step 1  creates new ClickListener (As it implements OnClickListener) and sets as instance of OnClickListener in Button class. See Button class
        btnPrint.setOnClickListnner(new ClickListener());

        //Set 3 - goes to method Listen
        listen();*/

       /*
        Create inner class, need to specify outer class first
        Must use initialized object
        Does not work creating Outer class
        Gearbox.Gear first2 = new Gearbox.Gear(1, 12.3);
        */
       /* Gearbox mclaren = new Gearbox(6);
        mclaren.operateClutch(true);

        mclaren.changeGear(1);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(1000));
        mclaren.changeGear(2);
        mclaren.operateClutch(true);
        mclaren.changeGear(3);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(3000));*/

    }

}

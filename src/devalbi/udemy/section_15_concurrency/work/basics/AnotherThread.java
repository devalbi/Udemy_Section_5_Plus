package devalbi.udemy.section_15_concurrency.work.basics;

import static devalbi.udemy.section_15_concurrency.ThreadColor.*;

/**
 * Created by timbuchalka on 25/05/2016.
 */
public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch(InterruptedException e) { //caatches interupt() method
            System.out.println(ANSI_BLUE +  "Another thread woke me up");
            return; //Closes thread
        }

        System.out.println(ANSI_BLUE + "Three seconds have passed and I'm awake");
    }
}

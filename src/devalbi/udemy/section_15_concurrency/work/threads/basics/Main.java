package devalbi.udemy.section_15_concurrency.work.threads.basics;

import static devalbi.udemy.section_15_concurrency.work.threads.basics.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();


                                            //anonymous class
        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
            }
        });

        //AAnother way of starting runnable class
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
//        myRunnable.run(); Never do this, JVM will handle it after start is called

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");


    }
}

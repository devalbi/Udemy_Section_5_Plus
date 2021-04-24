package devalbi.udemy.java_cert.section_8_challenge;

public class StaticExample {

    private static int staticIntCounter;

    public static void addCounter() {

        staticIntCounter++;
    }

    public static int getCouner(){
        return staticIntCounter;
    }

    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();

        staticExample.addCounter();
        System.out.println(getCouner());
    }
}

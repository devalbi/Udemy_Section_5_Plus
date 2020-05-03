package devalbi.udemy.section_11_naming_con.work._static;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

        StaticTest staticTest1 = new StaticTest("Static Class 1");
        System.out.println(staticTest1.getName() + " is instance number " + staticTest1.getNumInstance());

        StaticTest staticTest2 = new StaticTest("Static Class 2");
        System.out.println(staticTest2.getName() + " is instance number " + staticTest2.getNumInstance());

        StaticTest staticTest3 = new StaticTest("Static Class 3");
        System.out.println(staticTest3.getName() + " is instance number " + StaticTest.getNumInstance());
//        System.out.println(staticTest3.getName() + " is instance number " + staticTest2.getNumInstance());
        //can use any instance of class used to reference static field, as in case above.
        //Value will be the same for all instances
        //Bad practice to do this though. Should use the correct instance for reference.

        /*
        * With no instance of the main class, methods and fields must be static
        * */
        int answer = multiplier(6);
        System.out.println("Answer: " + answer);
        System.out.println("Multiplier: " + multiplier);


    }

    public static int multiplier(int num){
        return num * multiplier;
    }



}

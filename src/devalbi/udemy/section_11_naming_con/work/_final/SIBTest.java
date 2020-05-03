package devalbi.udemy.section_11_naming_con.work._final;

public class SIBTest {

    public static final String owner;

    static {
        owner = "Tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest(){
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("2nd Sstatic initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called.");
    }
}

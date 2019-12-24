package devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun;

public class Bun {
    private String name;

    //Created class to use Compounding
    public Bun(String name) {
        this.name = name;
    }

    public void bunDetails(){
        System.out.println("Unidentified bun");
    }

    public String getName() {
        return name;
    }
}

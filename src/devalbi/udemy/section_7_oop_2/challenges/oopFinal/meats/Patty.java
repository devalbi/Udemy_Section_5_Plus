package devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats;

public class Patty {
    private String name;
    //Created class to use Compounding
    public Patty(String name) {
        this.name = name;
    }

    public void meatDetails(){
        System.out.println("This Patty is unidentifiable.");
    }

    public String getName() {
        return name;
    }
}

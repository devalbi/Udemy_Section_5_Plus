package devalbi.udemy.section_7_oop_2.work.encapsulation;

public class Main {

    public static void main(String[] args) {
        Player p1 = new Player();
        p1.name = "Arron";
        p1.health = 20;
        p1.weapon = "Axe";

        int damage = 10;
        p1.loseHealth(damage);
        System.out.println("Remaining health is " + p1.healthRemaining());

        damage = 11;
        p1.health = 200; // being able to access directly, opens system open to being manipulated in ways we don't want.
        p1.loseHealth(damage);
        System.out.println("Remaining health is " + p1.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Arron", 90, "Axe");
        System.out.println("Initial health is: " + enhancedPlayer.getHealth());
    }
}

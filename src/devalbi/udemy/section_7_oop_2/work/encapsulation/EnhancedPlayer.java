package devalbi.udemy.section_7_oop_2.work.encapsulation;

public class EnhancedPlayer {
    private String name, weapon;
    private int health;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        this.weapon = weapon;
        if(health > 0 && health <=100) {
            this.health = health;
        }
    }

    //Use encapsulation to do validation.
    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0 ){
            System.out.println("Player knocked out");
            //reduce no of lives for player
        }
    }
    public int getHealth(){
        return this.health;
    }
}

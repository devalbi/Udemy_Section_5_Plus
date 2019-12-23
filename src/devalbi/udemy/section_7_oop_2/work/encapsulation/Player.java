package devalbi.udemy.section_7_oop_2.work.encapsulation;

public class Player {

    //If we change name, would cause issue in any class that uses that field.
    //Could be referenced  in many places, this would cause issues
    //Also may forget to initalize.
   //may not be initlaized if not in constructors
    //Validators in methods and constructors prevent bad data
    public String name, weapon;
    public int health;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0 ){
            System.out.println("Player knocked out");
            //reduce no of lives for player
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}

package devalbi.udemy.section_7_oop_2.challenges.oopFinal;

import devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun.Bun;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun.Multigrain;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats.Beef;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats.Patty;

public class HealthyBurger extends Burger {

    private  Bun bun;
    private Patty patty;

    private int healthyIngredientsCounter = 0;
    private String healthyIngredients = "";
    private String healthyBurgerDetails = "";

    private static int MAX_NUMBER_HEALTHY_INGREDIENTS = 2;
    private static int MAX_OPTION_HEALTY = 4;

    public HealthyBurger() {
        setPrice(10.00d);
        setName("Healthy Burger");
         this.bun =  new Multigrain();
         this.patty = new Beef();
    }

    @Override
    public void InputIngredient(){

        String optionList = "Please enter the number for ingredient you wish: \n" +
                "Enter '1' for Guacamole \n" +
                "Enter '2' for Coleslaw \n" +
                "Enter '3'  for Brie \n" +
                "Enter '4' for Onions \n" +
                "Enter '0' to when done. \n";

        System.out.println("Would you like to add ingredients? \n\n" + "Enter 'y' to add ingredients. Otherwise any other key to skip.");
        String addIngredients = scanner.nextLine();
        if(addIngredients.toLowerCase().equals("y")) {
            System.out.println("You can up to " + MAX_NUMBER_HEALTHY_INGREDIENTS + " ingredients");
            while (healthyIngredientsCounter < MAX_NUMBER_HEALTHY_INGREDIENTS) {
                System.out.println(optionList +"\n" + "you can add " + (MAX_NUMBER_HEALTHY_INGREDIENTS - healthyIngredientsCounter) + " more ingredients \n");

                boolean hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    if (option == 0) {
                        System.out.println("please enter any key to confirm you are finished \n" +
                                "Otherwise enter any 'y' to continue adding ingredients. \n");
                        addIngredients = scanner.nextLine();
                        if (addIngredients.toLowerCase().equals("y")) {
                            continue; // continues to next iteration of loop.
                        } else {
                            break; //breaks out of loop.
                        }
                    }
                    if ((option >= 1) && (option <= MAX_OPTION_HEALTY)) {
                        addIngredient(option);
                        healthyIngredientsCounter++;
                    } else {
                        System.out.println("You have entered an invalid option, please renter.");
                    }
                }
            }
        }
        //scanner.close(); removed as
        setFinalPrice(); //Gets final price and prints out for user
        System.out.println(this.getBurgerDetails());
    }

    @Override
    public void addIngredient(int option){
        //Validation on option and ingredientsCounter are handled in Scanner class.
        switch (option){
            case 1:
                addIngredient("Guacamole");
                break;
            case 2:
                addIngredient("Coleslaw");
                break;
            case 3:
                addIngredient("Brie");
                break;
            case 4:
                addIngredient("Onions");
                break;
            default: //Should not be hit, validation in scanner class should prevent this.
                System.out.println("Nothing added");
                break;
        }
    }

    @Override
    public String getBurgerDetails() {
        return super.getBurgerDetails();
    }

    public String getHealthyBurgerDetails() {
        return healthyBurgerDetails;
    }

    public String getHealthyIngredients() {
        return healthyIngredients;
    }
}

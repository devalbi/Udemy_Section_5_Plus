package devalbi.udemy.section_7_oop_2.challenges.oopFinal;

import devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun.Bun;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats.Patty;

public class HealthyBurger extends Burger {

    private  Bun bun;
    private Patty patty;

    private int healthyIngredientsCounter = 0;
    private String healthyIngredients = "";
    private String healthyBurgerDetails = "";

    private static int MAX_NUMBER_HEALTHY_INGREDIENTS = 2;
    private static int MAX_OPTION_HEALTY = 4;
    private static String HEALTHY_OPTION_LIST ="Please enter the number for ingredient you wish: \n" +
                                                "Enter '1' for Guacamole \n" +
                                                "Enter '2' for Coleslaw \n" +
                                                "Enter '3'  for Brie \n" +
                                                "Enter '4' for Onions \n" +
                                                "Enter '0' to when done. \n";

    public HealthyBurger(){
        super("Beef", "Multigrain", 11.00d, "Healthy Hamburger");
    }                                                                                                                                        

    //overrides Hamburger inputIngredients() method.
    @Override
    public void inputIngredient(){
        //Calls Hamburger method first to add ordinary ingredients.
        super.inputIngredient();

        //Now adds Healthy Hamburger ingredients.
        System.out.println("Would you like to add some healthy ingredients? \n\n" + "Enter 'y' to add ingredients. Otherwise any other key to skip.");
        String input = scanner.nextLine();
        if(input.toLowerCase().equals("y")) {
            while (healthyIngredientsCounter < MAX_NUMBER_HEALTHY_INGREDIENTS) {
                System.out.println(HEALTHY_OPTION_LIST +"\n" + "you can add " + (MAX_NUMBER_HEALTHY_INGREDIENTS - healthyIngredientsCounter) + " more healthy ingredients \n");
                boolean hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    int nextInt = scanner.nextInt();
                    scanner.nextLine();
                    if (nextInt == 0) {
                        System.out.println("please enter any key to confirm you are finished \n" +
                                "Otherwise enter any 'y' to continue adding ingredients. \n");
                        input = scanner.nextLine();
                        if (input.toLowerCase().equals("y")) {
                            continue; // continues to next iteration of loop.
                        } else {
                            break; //breaks out of loop.
                        }
                    }
                    if ((nextInt >= 1) && (nextInt <= MAX_OPTION_HEALTY)) {
                        addHealthyIngredient(nextInt);  //@Gav Step 6 - this should call the child/healthyburger/this class' method below.
                        healthyIngredientsCounter++;
                    } else {
                        System.out.println("You have entered an invalid nextInt, please renter.");
                    }
                }
            }
        }
        calculatePrice();//Gets final price and prints out for user
    }

    public void addHealthyIngredient(int option){
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

    //gets adds price for healthy burger. Uses getPrice as we want the base price as calculateFinalPrice() is
    @Override
    public void calculatePrice() {
        double healthyIngredientsPrice = (double) getPrice() + healthyIngredientsCounter + (getIngredientsCount() * 0.5);
        super.setFinalPrice(healthyIngredientsPrice);
    }

}

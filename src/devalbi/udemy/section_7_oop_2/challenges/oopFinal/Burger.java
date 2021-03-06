package devalbi.udemy.section_7_oop_2.challenges.oopFinal;

import devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun.Bun;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun.Multigrain;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.bun.WhiteBun;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats.Beef;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats.Chicken;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats.Patty;
import devalbi.udemy.section_7_oop_2.challenges.oopFinal.meats.Veggie;

import java.util.Scanner;

public class Burger {

    private Patty patty;
    private Bun bun;
    private double price, finalPrice;
    private int ingredientsCount = 0;
    private String ingredients ="";
    private String name;

    private static int MAX_NUMBER_INGREDIENTS = 4; //Making static as is not instance dependent and can save memory.
    private static int MAX_OPTION = 4;
    protected static String OPTIONS_LIST = "Please enter the number for ingredient you wish: \n" +
                                            "Enter '1' for Tomato \n" +
                                            "Enter '2' for Lettuce \n" +
                                            "Enter '3'  for Cheese \n" +
                                            "Enter '4' for Bacon \n" +
                                            "Enter '0' to when done. \n";

    Scanner scanner = new Scanner(System.in); //Using as an instance variable as opposed to a local variable.
    //Scanner.close(); was causing an error when being used in the method, removed it to prevent this error:
/*    Exception in thread "Main" java.util.NoSuchElementException: No line found, at java.base/java.util.Scanner.nextLine(Scanner.java:1651), at devalbi.udemy.section_7_oop_2.challenges.oopFinal.Hamburger.InputIngredient(Hamburger.java:75))*/

    //Constructor for full configuration.
    public Burger(String patty, String bun, double price, String name) {
        this(price, name);
        if(bun.toLowerCase().equals("multigrain")){
            this.bun = new Multigrain();
        } else {
            this.bun = new WhiteBun();
        }
        if(patty.toLowerCase().equals("chicken")){
            this.patty = new Chicken();
        } else if (patty.toLowerCase().equals("veggie")) {
            this.patty = new Veggie();
        } else {
            this.patty = new Beef();
        }
    }

    //Constructor for Price and Name
    public Burger(double price, String name) {
        this();
        if(price < 0.0d){
            this.price = 0.0d;
        } else {
            this.price = price;
        }
        if(name == null){
            this.name = "BurgerPatty";
        } else {
            this.name = name;
        }
    }
    //Default Hamburger
    public Burger() {
        this.price = 10.00d;
        this.name = "BurgerPatty";
        this.bun =  new WhiteBun();
        this.patty = new Beef();
    }

    //Method to allow user to input their options
    public void inputIngredient(){ //@Gav Step 2. Child/healthyBurger calling this method.
        System.out.println(OPTIONS_LIST + "\nWould you like to add ingredients? \n" + "Enter 'y' to add ingredients. Otherwise any other key to skip.");
        String input = scanner.nextLine();
        if(input.toLowerCase().equals("y")) {
            while (ingredientsCount < MAX_NUMBER_INGREDIENTS) {

                System.out.println(OPTIONS_LIST + "\nYou can add " + (MAX_NUMBER_INGREDIENTS - ingredientsCount) + " more ingredients \n");
                boolean hasNextInt = scanner.hasNextInt();

                if (hasNextInt) {
                    int nextInt = scanner.nextInt();
                    scanner.nextLine(); //Needed when using .nexInt().
                    //Used to check if User does not want to continue adding items

                    if (nextInt == 0) {
                        System.out.println("Please enter any key to confirm you are finished \n" +
                                            "Otherwise enter any 'y' to continue adding ingredients. \n");
                        input = scanner.nextLine();
                        //Confirms user does not want to continue.
                        if (input.toLowerCase().equals("y")) {
                            continue; // continues to next iteration of loop.
                        } else {
                            break; //breaks out of loop.
                        }
                    }

                    if ((nextInt >= 1) && (nextInt <= MAX_OPTION)) {
                        //If option is in item preset, adds item
                        addIngredient(nextInt);
                        ingredientsCount++;
                        ingredients += ",";
                    } else {
                        System.out.println("You have entered an invalid nextInt, please renter.");
                    }
                }
            }
        }
        calculatePrice(); //Gets final price and prints out for user
    }

    //When ingredients is added, this method handles it being added to ingredients
    public void addIngredient(int option){ //@Gav Step 4. Want to call this one, but it is calling child one
        //Validation on option and ingredientsCounter are handled in Scanner class.
        switch (option){
            //If wanted to assign unique values, could have "addToFinalPrice(double price)" and put in each case.
            case 1:
                ingredients += " Tomato for $0.50";
                System.out.println("Tomato added to burger!");
                break;
            case 2:
                ingredients += " Lettuce for $0.50";
                System.out.println("Lettuce added to burger!");
                break;
            case 3:
                ingredients += " Cheese for $0.50";
                System.out.println("Cheese added to burger!");
                break;
            case 4:
                ingredients += " Bacon for $0.50";
                System.out.println("Bacon added to burger!");
                break;
            default: //Should not be hit, validation in scanner class should prevent this.
                System.out.println("Nothing added");
                break;
        }
    }

    public void addIngredient(String option){
        //Used to add ingredients from subclasses
        //or using Strings.
        if(option.equals(",")){
            ingredients += option;
        } else {
            ingredients += " " + option + " for $1.00";
            System.out.println(option + " added to burger!");
        }
    }

    //Used to structure the final print out to the user
    public String getBurgerDetails(){
        String finalBurgerDetails;
        if(ingredients == null) {
            finalBurgerDetails = "You have ordered a " + getName() +
                    " burger, with a " + patty.getName() +" on a " + bun.getName() + ". \n" +
                    "The final price is: $" + getPrice();
        } else {
            finalBurgerDetails = "You have ordered a " + getName() +
                    " burger, with a " + patty.getName() + " on a " + bun.getName() +
                    " bun for $" + getPrice() + ". \n" +
                    "You have also added the following ingredients:" +
                    ingredients + ". " +
                    "The final price is: $" + getFinalPrice();
        }
        return finalBurgerDetails;
    }

    public String getName() {
        return name;
    }

    public void calculatePrice(){
        //Calculates final price then sets the price to new value.
        this.finalPrice = getPrice() + (ingredientsCount * 0.5d);
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIngredientsCount() {
        return ingredientsCount;
    }

    public String getBunName() {
        return bun.getName();
    }

    public String getPattyName(){
        return patty.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

}

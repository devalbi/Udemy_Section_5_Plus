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
    private String ingredients;
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
    //Scanner.close(); was causing an error when being used in the method,
    //Removed it to prevent this error:
/*    Exception in thread "main" java.util.NoSuchElementException: No line found
    at java.base/java.util.Scanner.nextLine(Scanner.java:1651)
    at devalbi.udemy.section_7_oop_2.challenges.oopFinal.Burger.InputIngredient(Burger.java:75)
    at devalbi.udemy.section_7_oop_2.challenges.oopFinal.Main.main(Main.java:14)

    Not sure if this keeps the scanner object alive until object is removed?*/

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
            this.name = "Hamburger";
        } else {
            this.name = name;
        }
    }
    //Default Burger
    public Burger() {
        this.price = 10.00d;
        this.name = "Hamburger";
        this.bun =  new WhiteBun();
        this.patty = new Beef();
    }

    public void inputIngredient(){
        System.out.println(OPTIONS_LIST + "\nWould you like to add ingredients? \n" + "Enter 'y' to add ingredients. Otherwise any other key to skip.");
        String input = scanner.nextLine();
        if(input.toLowerCase().equals("y")) {
            while (ingredientsCount < MAX_NUMBER_INGREDIENTS) {
                System.out.println(OPTIONS_LIST + "\nYou can add " + (MAX_NUMBER_INGREDIENTS - ingredientsCount) + " more ingredients \n");

                boolean hasNextInt = scanner.hasNextInt();
                if (hasNextInt) {
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    if (option == 0) {
                        System.out.println("Please enter any key to confirm you are finished \n" +
                                            "Otherwise enter any 'y' to continue adding ingredients. \n");
                        input = scanner.nextLine();
                        if (input.toLowerCase().equals("y")) {
                            continue; // continues to next iteration of loop.
                        } else {
                            break; //breaks out of loop.
                        }
                    }
                    if ((option >= 1) && (option <= MAX_OPTION)) {
                        this.addIngredient(option);
                        ingredientsCount++;
                        ingredients += ",";
                    } else {
                        System.out.println("You have entered an invalid option, please renter.");
                    }
                }
            }
        }
        this.setFinalPrice(); //Gets final price and prints out for user
    }

    public void addIngredient(int option){
        //Validation on option and ingredientsCounter are handled in Scanner class.
        switch (option){
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

    public String getBurgerDetails(){ //Used to structure the final print out to the user
        String finalBurgerDetails;
        if(ingredients == null) {
            finalBurgerDetails = "You have ordered a " + getName() +
                    " burger on a " + bun.getName() + ". \n" +
                    "The final price is: $" + getPrice();
        } else {
            finalBurgerDetails = "You have ordered a " + getName() +
                    " burger on a " + bun.getName() +
                    " bun for %  " + getPrice() + ". \n" +
                    "You have also added the following ingredients:" +
                    ingredients + ". " +
                    "The final price is: $" + getFinalPrice();
        }
        return finalBurgerDetails;
    }

    public String getName() {
        return name;
    }

    public void setFinalPrice(){
        //Calculates final price then sets the price to new value.
        this.finalPrice = getPrice() + (ingredientsCount * 0.5d);
    }

    public double getPrice() {
        return price;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setPrice(double price) {
        this.finalPrice = price;
    }

    public void setPatty(Patty patty) {
        this.patty = patty;
    }

    public void setBun(Bun bun) {
        this.bun = bun;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getIngredientsCount() {
        return ingredientsCount;
    }

}

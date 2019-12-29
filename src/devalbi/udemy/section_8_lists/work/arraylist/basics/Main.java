package devalbi.udemy.section_8_lists.work.arraylist.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choices");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the arraylist of grocery items.");
        System.out.println("\t 2 - To add an item to the arraylist.");
        System.out.println("\t 3 - To modify an item in the arraylist.");
        System.out.println("\t 4 - To remove an item from the arraylist.");
        System.out.println("\t 5 - To search for an item in the arraylist.");
        System.out.println("\t 6 - To process the arraylist.");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Please enter the grocery item number you want to modify: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(itemNo, newItem);
        //Used to get correct item as index and what user sees are not the same
        //but this is bad practise - should be handled in classes method
    }

    public static void removeItem(){
        System.out.print("Please enter the grocery item number you want to modify: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
        //Used to get correct item as index and what user sees are not the same
        //but this is bad practise - should be handled in classes method
    }

    public static void searchForItem(){
        System.out.print("item to search for: ");
        String seachItem = scanner.nextLine();
        if(groceryList.onFile(seachItem)){ //checks to see if it's true.
            System.out.println("Found " + seachItem + " in our grocery arraylist.");
        } else {
            System.out.println(seachItem + " was not found in the grocery arraylist.");
        }
    }

    //Used to copy arraylist A to arraylist B
    public static void processArrayList(){
        ArrayList<String> arrayListB = new ArrayList<String>();
        arrayListB.addAll(groceryList.getGroceryList()); //Copy and add entire contents of one array to another.

        //Even quicker.
        ArrayList<String> arrayListC = new ArrayList<String>(groceryList.getGroceryList());

        //converts ArrayList to Array
        String myArray[] = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}

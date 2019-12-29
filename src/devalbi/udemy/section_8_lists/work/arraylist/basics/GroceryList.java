package devalbi.udemy.section_8_lists.work.arraylist.basics;

import java.util.ArrayList;

public class GroceryList {

    //define type/objects in <...>
    //ArrayList is a class, unlike array, hence has constructor (...)
    //Size does not need to be defined.
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList(){
        return groceryList;
    }

    public void addGroceryItem(String item){
        //.add is used to add an object to arrayList.
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " +groceryList.size() + " items in your grocery arraylist.");
        for(int i = 0; i < groceryList.size(); i++){
            //get() used to get value for index.
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //allows a user to find an item by it's namae
    public void modifyGroceryList(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryList(position, newItem);
        }
    }

    //replace item
    // As only accessed within the class now, can make private.
    //Forces people to use the methods we want them to use.
    private void modifyGroceryList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + groceryList.get(position) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }

    //Remove item from arraylist

    // As only accessed within the class now, can make private.
    //Forces people to use the methods we want them to use.
    private void removeGroceryItem(int position){
        groceryList.remove(position);
        // 1. Milk
        // 2. Bread - remove this item
        // 3. Cheese

        // 1. Milk
        // 2. Cheese - Moves cheese item up to next position.
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >=0){
            return true;
        } else{
            return false;
        }
    }

    private int findItem(String searchItem){

        return groceryList.indexOf(searchItem);
        //contains() is built into array arraylist
       //boolean exists = groceryList.contains(searchItem);
        //used to get index of search items
        //searches arraylist and returns the index position in arraylist, returns -1 if does not exist.
/*        int position = groceryList.indexOf(searchItem);
        if(position >= 0){ //if returns -1, aka not found in arraylist.
            return groceryList.get(position);
        } else {
            return null;
        }*/
    }
}
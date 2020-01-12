package devalbi.udemy.section_9_abstraction.challenge.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Nissan", "350z");
        Car car2 = new Car("Ford", "Focus");

        System.out.println(car1.toString());
        saveObject(car1);
        saveObject(car2);
       // loadObject(car2);

        System.out.println(car2.toString());

        ISaveable truck1 = new Truck("Volvo", "Volvo FH 520 PULLER", 4000);
        Truck truck2 = new Truck("PeterBilt", "389", 3200);

        System.out.println(truck1.toString());
        //System.out.println("Make = " + ((Truck) truck1).getMake()); //used to access class methods if datatype for object is interface.
        saveObject(truck1);
        saveObject(truck1);
        loadObject(truck2);

        System.out.println(truck2.toString());

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    /*
    * gets size of list by seeing how many indexes created in write class?
    * .write() creates an arraylist and adds all items to the list.
    * So using this method we can see the number of objects in the list as it changes with each time write is called.
    */

    //Because we are passing ISaveable interface, we can pass any object that implements this interface.
    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device." );
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        List<String> values = readValues(); //simulates getting the data from somewhere
        objectToLoad.read(values); //Calls the Class that implements ISaveable that is passed into this and finds the "read()" method.
    }
}

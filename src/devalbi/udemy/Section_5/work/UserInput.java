package devalbi.udemy.Section_5.work;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of Birth");

        //Checks input as int, if not int, will not remove it.
        //Returns false if not an int.
        //Stops type errors.
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handles next line character as number parsing scanner looks for line separator and takes enter key as this separator.

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2019 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is: " + name + "\n" + " and your age is: " + age);
            } else {
                System.out.println("Invalid year of Birth");
            }
        } else {
            System.out.println("Unable to parse year of Birth");
        }


        scanner.close();
    }
}

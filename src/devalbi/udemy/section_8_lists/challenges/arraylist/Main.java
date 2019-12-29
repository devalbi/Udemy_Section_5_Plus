package devalbi.udemy.section_8_lists.challenges.arraylist;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("087 137 1356");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContactList();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = "+ phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter name of contact you want to modify: ");
        String name = scanner.nextLine();
        Contact currentContact = mobilePhone.searchContact(name);

        if(currentContact == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter the new name of the replacement contact: ");
        String newName = scanner.nextLine();
        System.out.print("Enter the new number for the replacement contact: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);

        if(mobilePhone.modifyContact(currentContact, newContact)){
            System.out.println(currentContact.getName() +" is replaced by " + newName);
        } else{
            System.out.println("Error updating records");
        }
    }

    private static void removeContact() {
        System.out.println("Enter name of contact you want to remove: ");
        String name = scanner.nextLine();
        Contact currentContact = mobilePhone.searchContact(name);

        if (currentContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        if(mobilePhone.removeContact(currentContact)){
            System.out.println(currentContact.getName() +" is removed.");
        } else{
            System.out.println("Error removing records");
        }
    }

    private static void queryContact() {
        System.out.println("Enter name of contact: ");
        String name = scanner.nextLine();
        Contact currentContact = mobilePhone.searchContact(name);

        if (currentContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println(currentContact.printContact());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print contacts\n" +
                "2  - to add a new contact\n" +
                "3  - to update an existing contact\n" +
                "4  - to remove an existing contact\n" +
                "5  - query if an existing contact exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}

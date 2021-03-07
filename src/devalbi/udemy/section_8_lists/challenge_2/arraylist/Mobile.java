package devalbi.udemy.section_8_lists.challenge_2.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mobile {

    private List<Contact> contacts;


    public Mobile() {
        this.contacts = new ArrayList<Contact>();
    }


    public Contact createContact(String name, String number) {
        if((name.isEmpty()) || number.isEmpty()) {
            System.out.println("Name and number must not be empty");
            return null;
        }

        if (findContact(name, number) != null) {
            return null;
        }


        Contact newContact = new Contact(name, number);
        addContact(newContact);
        return newContact;
    }


    protected void addContact(Contact contact) {
        contacts.add(contact);
        return;
    }


    protected void removeContact(Contact contact) {
        if (!doesContactExist(contact)) {
            System.out.println("No such contract exists");
        }
        System.out.println(contact.getName() + ", " + contact.getNumber() + " removed.");
        contacts.remove(contact);
    }


    protected void changeContact(Contact contact){

        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to change \n" +
                "1) Name \n" +
                "2) Number \n" +
                "0) Exit");

        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter New Name");
                    String newName = scanner.nextLine();
                    contact.setName(newName);
                    break;
                case 2:
                    System.out.println("Enter New Number");
                    String newNumber = scanner.nextLine();
                    contact.setNumber(newNumber);
                    break;
                default:
                    break;
            }
        }
        //scanner.close();
    }

    protected Contact findContact() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = scanner.nextLine();

        System.out.println("Enter Number");
        String number = scanner.nextLine();

        //scanner.close();

        return findContact(name, number);
    }


    protected void findContact(String name) {
        List<Contact> contactSearchByNameResult = new ArrayList<>();
        for (int i = 0; i < contacts.size(); i++) {
            if (name.equals(contacts.get(i).getName())) {
                System.out.println("Contact found. " +
                        "Name: " + contacts.get(i).getName() + ", number: " + contacts.get(i).getNumber());
                contactSearchByNameResult.add(contacts.get(i));
            }
        }

        if(contactSearchByNameResult.isEmpty()) {
            System.out.println("There was no contacts found for name: " + name);
            return;
        }

        printContacts(contactSearchByNameResult);
    }


    protected Contact findContact(String name, String number) {
        for (int i = 0; i < contacts.size(); i++) {
            if(name.equals(contacts.get(i).getName())) {
                if (number.equals(contacts.get(i).getNumber())) {
                    System.out.println("Contact found. " +
                            "Name: " + contacts.get(i).getName() + ", number: " + contacts.get(i).getNumber());
                    return contacts.get(i);
                }
            }
        }
        System.out.println("No Contact Found");
        return null;
    }


    protected boolean doesContactExist (Contact contact){
/*        if (contacts.contains(contact)) {
            System.out.println(contact.getName() + " already exists");
            return true;
        }*/
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(contact.getName())) {
                if (contacts.get(i).getNumber().equals(contact.getNumber())) {
                    return true;
                }
            }
        }
        System.out.println("Contact does not exist");
        return false;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    protected void printContacts(List<Contact> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Name: " + arrayList.get(i).getName() +
                    " Number: " + arrayList.get(i).getNumber());
        }
    }


    protected void getOptions() {
        Scanner scanner = new Scanner(System.in);
        printOptions();

        boolean isActive = true;

        while (isActive) {
            System.out.println("Enter you option");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int option = scanner.nextInt();
                scanner.nextLine();
                switch (option) {
                    case 1:
                        System.out.println("Add New Contact \n" +
                                "Enter Name");
                        String name = scanner.nextLine();
                        System.out.println("Enter Number");
                        String number = scanner.nextLine();
                        createContact(name, number);
                        break;
                    case 2:
                        System.out.println("Remove Contact");
                        Contact findContact = findContact();
                        if (findContact != null) {
                            removeContact(findContact);
                        }
                        break;
                    case 3:
                        System.out.println("Find Contact by name \n" +
                                "Enter Name");
                        name = scanner.nextLine();
                        findContact(name);
                        break;
                    case 4:
                        System.out.println("Change Contact");
                        Contact changeContact = findContact();
                        if (changeContact != null) {
                            changeContact(changeContact);
                        }
                        break;
                    case 5:
                        printContacts(contacts);
                        break;
                    case 6:
                        printOptions();
                        break;
                    case 0:
                        isActive = false;
                        break;
                    default:
                        break;
                }
            }
        }
        scanner.close();
    }

    public void printOptions() {
        System.out.println("Select your option: \n" +
                "1) Add Contact \n" +
                "2) Remove Contact\n" +
                "3) Find Contact \n" +
                "4) Change Contact \n" +
                "5) Print Contacts \n" +
                "6) Print Options \n" +
                "0) Exit");
    }
}



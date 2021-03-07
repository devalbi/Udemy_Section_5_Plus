package devalbi.udemy.section_8_lists.challenge_2.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        Contact contact1 = new Contact("Arron Brady", "0871346843");
        Contact contact2 = new Contact("Evan Brady", "0877493218");
        Contact contact3 = new Contact("Dylan Brady", "0871946372");
        Contact contact4 = new Contact("Joe Soaps", "0876754323");
/*        Contact contact5 = new Contact("Joe Soaps", "0876754324");
        Contact contact6 = new Contact("Joe Soaps", "0876754325");
        Contact contact7 = new Contact("Joe Soaps", "0876754326");*/

        mobile.addContact(contact1);
        mobile.addContact(contact2);
        mobile.addContact(contact3);
        mobile.addContact(contact4);
/*        mobile.addContact(contact5);
        mobile.addContact(contact6);
        mobile.addContact(contact7);
        mobile.findContact("Joe Soaps"); */


        mobile.createContact("July Summers", "08645837283");
/*        mobile.createContact("July Summers", "08645837283");*/
/*        mobile.createContact("July", "");
        mobile.createContact("", "08645837283");*/

/*        mobile.removeContact(mobile.findContact("July Summers", "08645837283"));
        mobile.removeContact(mobile.findContact());*/
        //mobile.changeContact(mobile.findContact());
//        mobile.changeContact(mobile.findContact());

        mobile.printContacts(mobile.getContacts());

        mobile.getOptions();

        List<Integer> intList = new ArrayList<>();
        int newVal =  10;
        intList.add(newVal);
        Integer intValue = 10;
        int sum = intValue % 2;
    }
}

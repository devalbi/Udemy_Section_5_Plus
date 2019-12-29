package devalbi.udemy.section_8_lists.challenges.arraylist;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> contactList;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getContactList(){
        return contactList;
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file.");
            return false;
        }

        contactList.add(contact);
        return true;
    }

    //Public method accessible to user to search by name and change number.
    public boolean modifyContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position < 0) { //checks to see if index is -1.
            System.out.println("Contact" + oldContact.getName() + " was not found");
            return false;
        } else if(findContact(newContact.getName())  != -1) {
            System.out.println("Contact with name " + newContact.getName() + " " +
                    "already exists. Update not successful.");
            return false;
        }
        //Changes Contact object in position
        this.contactList.set(position, newContact);
        return true;
    }


    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position < 0){ //checks to see if index is -1.
            System.out.println("Contact " + contact.getName() + " was not found.");
            return false;
        }
        //removes contact from arrayList if present/
        this.contactList.remove(position);
        System.out.println("Contact " + contact.getName() + " was deleted.");
        return true;
    }

    public String searchContact(Contact contact){
        if(findContact(contact) >= 0) {
            return contact.getName();
        } else{
            return null;
        }
    }

    //Finds a contact object using the name.
    public Contact searchContact(String name){
        int position = findContact(name);
        if(position >= 0) {
            return this.contactList.get(position);
        }
            return null;
        }

    //method to get index in ArrayList. Private to only call in this class.
    private int findContact(String name){
        for(int i = 0; i < contactList.size(); i++){
            Contact contact = this.contactList.get(i);

            if(contact.getName().equals(name)){
                return i; //returns the index number.
            }
        }
        return -1;
    }

    private int findContact(Contact contact){
        return contactList.indexOf(contact);
    }

    //Prints all Contacts in arrayList.
    public void printContactList(){
        System.out.println("You have " + contactList.size() + " contacts.");
        for(int i = 0; i < contactList.size(); i++){
            //get() used to get value for index.
            System.out.println((i+1) + ". " + contactList.get(i).printContact());
        }
    }
}

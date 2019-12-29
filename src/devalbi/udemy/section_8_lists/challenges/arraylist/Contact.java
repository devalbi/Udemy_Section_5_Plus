package devalbi.udemy.section_8_lists.challenges.arraylist;

public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String printContact(){
        return "Name: " + getName() + ": " + getNumber();
    }

    //Used to create a new object.
    //Static so object does not have to be instantiated to be called.
    public static Contact createContact(String name, String number){
        return new Contact(name, number);
    }
}

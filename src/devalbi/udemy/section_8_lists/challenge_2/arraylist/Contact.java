package devalbi.udemy.section_8_lists.challenge_2.arraylist;

public class Contact {

    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
        System.out.println("Contact Created! Name: " + this.name + ", number: " + this.number);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            System.out.println("Name changed to " + name);
            this.name = name;
        }
    }

    public void setNumber(String number) {
        if(number.isEmpty()) {
            System.out.println("number cannot be empty");
        } else {
            System.out.println("Number changed to " + number);
            this.number = number;
        }
    }
}

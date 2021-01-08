package devalbi.udemy.section_6_oop_1.challenges;

public class VIPCustomer2 {

    private String name, email;
    private double creditLimit;

    public VIPCustomer2() {
        this("Jane Doe", "JaneDoe@gmail.com", 3500.00);
    }

    public VIPCustomer2(String name, String email) {
        this(name, email, 3500.00);
    }

    public VIPCustomer2(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}

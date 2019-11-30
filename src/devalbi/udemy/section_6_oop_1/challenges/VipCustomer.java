package devalbi.udemy.section_6_oop_1.challenges;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Arron", 2500.00d, "test@test.com");
    }

    public VipCustomer(String name, String emailAddress){
        this(name, 2500.00d, emailAddress);
        /*this.name = name;
        this.emailAddress = emailAddress;*/
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

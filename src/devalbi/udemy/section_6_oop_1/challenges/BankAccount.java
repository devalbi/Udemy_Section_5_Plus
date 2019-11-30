package devalbi.udemy.section_6_oop_1.challenges;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName, customerEmail, customerPhoneNumber;

    public BankAccount(){
        //Calls constructor using "this()", must be first line. Used to populate default values.
        //Calls constructor defined below.
        this("54326", 500.32, "DefaultName", "DefaultEmailAddress", "0871234567");
        System.out.println("Empty constructor started");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;

        //setBalance(100);
/*        Can use setter method, which is good for validation
        But can cause issues such as in inheritance/subclasses.
        Might not be executed if called from Subclass

        Also an initialization step may not be done before this which may cause an issue.
        Default is to uses this.x=x*/

    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("123454", 100.55, customerName, customerEmail, customerPhoneNumber);
        //this.customerName = customerName;
        //this.customerEmail = customerEmail;
        //this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public double deposit(double depositValue) {
        //Checks if deposit is not a negative value
        if (depositValue > 0) {
            this.balance += depositValue;
            System.out.println("Deposited $" + depositValue + ", Balance is now: " + balance);
        } else {
            System.out.println("Cannot deposit a negative value: $" + depositValue + " deposit did not complete");
        }
        return balance;
    }

    public double withdrawal( double withrawalValue ){
        //checks if withdrawal is not negative value or more than balance.
        if(withrawalValue > 0.0d && withrawalValue < this.balance){
            this.balance -= withrawalValue;
            System.out.println("Withrew $" + withrawalValue + ", Balance is now: " + balance);
        } else{
            System.out.println("Cannot withdraw $" + withrawalValue + ", as more than Balance: " + this.balance);
        }
        return balance;
    }
}

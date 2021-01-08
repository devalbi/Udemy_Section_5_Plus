package devalbi.udemy.section_6_oop_1.challenges;

public class BankAccount2 {
    private String accountNumber;
    private double balance;
    private String name;
    private String phoneNumber;


    public BankAccount2(String accountNumber, String name, String phoneNumber) {
        this(accountNumber, 00.00, name, phoneNumber);
    }

    public BankAccount2(String accountNumber, double balance, String name, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public double deposit(double depositAmount) {
        if ((depositAmount <= 0)) {
            System.out.println("You cannot deposit less than or equal to 0");
        }
        balance += depositAmount;
        return balance;
    }

    public double withdraw(double withdrawAmount) {
        if ((withdrawAmount <= 0) || (withdrawAmount > balance)) {
            System.out.println("You cannot withdraw less than 0 or more than in your balance");
        }
        balance -= withdrawAmount;
        return balance;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

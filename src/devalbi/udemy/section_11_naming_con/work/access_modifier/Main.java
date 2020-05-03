package devalbi.udemy.section_11_naming_con.work.access_modifier;

public class Main {

    public static void main(String[] args) {
        Account arronsAccount = new Account("Arron");
        arronsAccount.deposit(1000);
        arronsAccount.withdrawl(500);
        arronsAccount.withdrawl(-200);
        arronsAccount.deposit(-20);
        arronsAccount.calculateBalance();

/*        //Allowed if class variables have public access modifiers
        //Error when var is private.
        //Only want to be able to access through public facing method for security
        arronsAccount.balance = 10000;
        arronsAccount.transactions.add(45000);*/

        System.out.println("Balance of accoutn is: " + arronsAccount.getBalance());

    }
}

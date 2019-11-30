package devalbi.udemy.section_6_oop_1.challenges;

public class Main_Challenge {

    public static void main(String[] args) {
/*        BankAccount account =  new BankAccount();
        account.setBalance(500.00d);
        account.deposit(-159.00d);
        System.out.println("Balance is: " + account.getBalance());
        account.deposit(159.00d);
        System.out.println("Balance is: " + account.getBalance());

        account.withdrawal(-159.00d);
        System.out.println("Balance is: " + account.getBalance());

        account.withdrawal(1000.00d);
        System.out.println("Balance is: " + account.getBalance());

        account.withdrawal(50.00d);
        System.out.println("Balance is: " + account.getBalance());*/

/*        VipCustomer vipCustomer = new VipCustomer("Arron", 2500.00d, "Test@test.com");
        VipCustomer vipCustomer2 = new VipCustomer("Brady","Test@test.com");
        VipCustomer vipCustomer3 = new VipCustomer();*/

        Wall_3 Wall_3 = new Wall_3(5,4);
        System.out.println("area= " + Wall_3.getArea());

        Wall_3.setHeight(-1.5);
        System.out.println("width= " + Wall_3.getWidth());
        System.out.println("height= " + Wall_3.getHeight());
        System.out.println("area= " + Wall_3.getArea());
    }
}

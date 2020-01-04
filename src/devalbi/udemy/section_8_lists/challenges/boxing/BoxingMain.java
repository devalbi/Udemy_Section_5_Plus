package devalbi.udemy.section_8_lists.challenges.boxing;

public class BoxingMain {

    public static void main(String[] args) {

        Bank bank = new Bank("AIB");
        bank.addBranch("Bray");
        bank.addBranch("Kilmacanogue");
        bank.addBranch("King St");

        bank.addCustomerToBranch("Bray", "Joe Blogs", 10.00);
        bank.addCustomerToBranch("Bray", "Jen Hike", 30.00);
        bank.addCustomerToBranch("Bray", "Christ Ring", 10.00);
        bank.addCustomerToBranch("Kilmacanogue", "Jane Doe", -10.00);
        bank.addCustomerToBranch("King St", "", 150.00);
        bank.addCustomerToBranch(" ", "Joe Blogs", 10.00);
        bank.addCustomerToBranch(" ", " ", 10.00);

        bank.addCustomerTransaction("Bray", "Joe Blogs", 25.00);
        bank.addCustomerTransaction("Bray", "Joe Blogs", 600.00);
        bank.addCustomerTransaction("Bray", "Joe Blogs", -425.00);

        bank.addCustomerTransaction("Kilmacanogue", "Jane Doe", -25.00);
        bank.addCustomerTransaction(" ", "Joe Blogs", 500.00);
        bank.addCustomerTransaction("Bray", "Joe Blogs", 0);



        bank.printBranchDetails("Bray");

    }
}

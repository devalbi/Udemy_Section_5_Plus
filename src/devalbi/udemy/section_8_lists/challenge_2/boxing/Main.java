package devalbi.udemy.section_8_lists.challenge_2.boxing;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("AIB");
        Branch branch1 = new Branch("Bray");
        Branch branch2 = new Branch("Greystones");

        Customer customer1 = new Customer("Arron", 100.00d);
        Customer customer2 = new Customer("Eoin", 150.00d);
        Customer customer3 = new Customer("Darren", 200.00d);
        Customer customer4 = new Customer("Steffan", 00.00d);
        Customer customer5 = new Customer("", 100.00d);
        Customer customer6 = new Customer("Steffan", -200.00d);
        Customer customer7 = new Customer("John", 250.00d);

        bank.addBranchToBank(branch1);
        bank.addBranchToBank(branch2);

        branch1.addCustomer(customer1);
        branch1.addCustomer(customer2);
        branch2.addCustomer(customer3);
        branch2.addCustomer(customer4);

        bank.printBranchesInBank();

        bank.addCustomerToBranch(branch1, customer7, 100.00d);
        addTransactions(branch1);
        addTransactions(branch2);

        bank.printBranchesInBank();



        }

    public static void addTransactions(Branch branch) {
        for(int i = 0; i<branch.getCustomerList().size(); i++) {
            for(int x = 0; x<=5; x++) {
                branch.getCustomerList().get(i).withdrawTransaction((x + 1) * 5);
            }
        }
    }
}


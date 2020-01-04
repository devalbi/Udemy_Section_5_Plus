package devalbi.udemy.section_8_lists.challenges.boxing;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches = new ArrayList<Branch>();
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void addBranch(String branchName){
        if((!validName(branchName)) || (doesBranchExist(branchName))){
            System.out.println("\nError adding branch.");
            return;
        }

        Branch newBranch = Branch.addBranch(branchName);
        branches.add(newBranch);
    }

    public void addCustomerToBranch(String branchName, String customerName, double transaction){

        Branch branch = findBranchByName(branchName);
        if((branch == null) || (!validName(customerName))){ //Checks to see if branch object is returned.
            System.out.println("Error adding Customer to Branch");
            return;
        }
        branch.addCustomerToBranch(customerName, transaction);

    }

    public void addCustomerTransaction(String branchName, String customerName, double transaction){

        Branch branch = findBranchByName(branchName);
        Customer customer = branch.findCustomerByName(customerName);
        if(customer == null){
            System.out.println("\nNo customer with name " + name);
            return;
        }
        //Checks to see if transaction has a value greater or less than 0.
        if (transaction == 0) {
            System.out.println("\nCannot carry out a transaction with value " + transaction);
            return;
        }

        //Prints out different message depending on deposit or withdrawal.
        if (transaction > 0) {
            System.out.println("\nCustomer " + customer.getName() + " has deposited $" + transaction);
            branch.customerTransaction(customer, transaction); //Example of autoboxing: double -> Double
            return;
        }
        if (transaction < 0) {
            System.out.println("\nCustomer " + customer.getName() + " has withdrawn $" + transaction);
            branch.customerTransaction(customer, transaction); //autoboxing, primitive added to Double arraylist.
            return;
        }
        /*//Old Way doing it, with Validation done in branch class.
        Branch branch = findBranchByName(branchName);
        branch.customerTransaction(customerName, transaction); //Validation is done in class*/
    }

    public void printBranchDetails(String branchName){
        Branch branch = findBranchByName(branchName);
        if(branch == null){
            System.out.println("\nBranch with name " + name + " was not found." );
        }
        branch.printBranchesDetails();
    }

    private Branch findBranchByName(String name){
        for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getBranchName().toLowerCase().contains(name.toLowerCase())){ //Use tolower() to avoid some potential issues with uppercase.
                return branches.get(i);
            }
        }
        return null;
    }

    //checks to see if customer exists, returns true if does, false if not
    private boolean doesBranchExist(String name){
        for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getBranchName().toLowerCase().contains(name.toLowerCase())){  //Use tolower() to avoid some potential issues with uppercase.
                return true;
            }
        }
        return false;
    }

    //Validates if Name is correct length and format
    public boolean validName(String name){
        if((name.matches("[A-Za-z␣]")) || name.length() >= 3 ){
            return true;
        }
        System.out.println("Name '" + name + "' is not valid, \n" +
                "Name must be at least 3 letters long\n");
        return false;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

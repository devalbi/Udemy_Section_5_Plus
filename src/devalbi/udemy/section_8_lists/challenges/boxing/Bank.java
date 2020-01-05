package devalbi.udemy.section_8_lists.challenges.boxing;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches = new ArrayList<Branch>();
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(String branchName){
        if((!validName(branchName)) || (findBranchByName(branchName) != null)){
            System.out.println("\nError adding branch.");
            return false;
        }

        Branch newBranch = Branch.addBranch(branchName);
        branches.add(newBranch);
        return true;
    }

    public boolean addCustomerToBranch(String branchName, String customerName, double transaction){

        Branch branch = findBranchByName(branchName);
        //Checks to see if branch object is returned, If name is valid and if addCustomerToBranch method returns false.
        if((branch == null) || (!validName(customerName)) || (!branch.addCustomerToBranch(customerName, transaction))){
            System.out.println("Error adding Customer to Branch");
            return false;
        }
        System.out.println("New Customer " + customerName + " was added to branch " + branch.getBranchName());
        return true;

    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){

        Branch branch = findBranchByName(branchName);
        if(branch == null){
            System.out.println("\nNo branch with name " + branchName);
            return false;
        }
        if(!branch.customerTransaction(customerName, transaction)){
            System.out.println("\nCannot carry out a transaction for customer " + customerName +" with value of $"+ transaction);
            return false;
        }

        //Prints out different message depending on deposit or withdrawal.
        if (transaction > 0) {
            System.out.println("\nCustomer " + customerName + " has deposited $" + transaction);
        }
        if (transaction < 0) {
            System.out.println("\nCustomer " + customerName + " has withdrawn $" + transaction);
        }

        branch.customerTransaction(customerName, transaction);
        return true;
    }

    //boolean value to optionally show customer transactions.
    public void printBranchDetails(String branchName, boolean showTransactions){
        Branch branch = findBranchByName(branchName);
        if(branch == null){
            System.out.println("\nBranch with name " + branch.getBranchName() + " was not found." );
        }
        branch.printBranchesDetails(showTransactions);
    }

    private Branch findBranchByName(String name){
        for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getBranchName().toLowerCase().equals(name.toLowerCase())){ //Use tolower() to avoid some potential issues with uppercase.
                return branches.get(i);
            }
        }
        return null;
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

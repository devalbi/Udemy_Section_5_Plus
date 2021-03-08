package devalbi.udemy.section_8_lists.challenge_2.boxing;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String bankName;
    private List<Branch> branchesList;

    public Bank(String bankName) {
        this.bankName = bankName;
        branchesList = new ArrayList<>();
    }

    void addBranchToBank(Branch newBranch) {
        if(isBranchInBank(newBranch)) {
            System.out.println("Branch already in the bank");
            return;
        }

        branchesList.add(newBranch);
    }

    void addCustomerToBranch(Branch branch, Customer customer, Double initialTransaction) {

        if(!isBranchInBank(branch)) {
            return;
        }
        if(branch.isCustomerInBranch(customer)) {
            System.out.println("Customer is already in the branch");
            return;
        }

        int indexValue = findBranchInBranchList(branch);
        branchesList.get(indexValue).addCustomer(customer);
        //example of unboxing
        branch.customerTransaction(customer, initialTransaction);
        System.out.println(customer.getName() + " is added to the branch " + branch.getBranchName());
    }

    void customerTransactionForBranch(Branch branch, Customer customer, double transactionValue) {
        if(!isBranchInBank(branch)) {
            return;
        }
        if(!branch.isCustomerInBranch(customer)) {
            return;
        }
        int indexValue = findBranchInBranchList(branch);
        branchesList.get(indexValue).customerTransaction(customer, transactionValue);
        System.out.println("Transaction successful \n" +
                "Customer: " + customer.getName() + ", transaction value: " + transactionValue);
    }

    int findBranchInBranchList(Branch branch) {
        if(branch == null) {
            System.out.println("Branch must not be null");
            return -1;
        }

        for(int i=0; i<branchesList.size(); i++) {
            if(branchesList.get(i).equals(branch)) {
                System.out.println("Branch "+ branch.getBranchName() + " found");
                return i;
            }
        }

        System.out.println("No Branch found.");
        return -1;
    }

    boolean isBranchInBank(Branch branch) {
        if (branch != null) {
            System.out.println("Branch cannot be null");
            return false;
        }

        for(int i=0; i<branchesList.size(); i++) {
            if(branchesList.get(i).equals(branch)) {
                System.out.println("Branch "+ branch.getBranchName() + " is not in bank");
                return true;
            }
        }
        System.out.println("No Branch found.");
        return false;
    }

    void printCustomersForBranch(Branch branch) {
        if(!isBranchInBank(branch)) {
            return;
        }
        branch.printCustomersInBranch();
    }

    void printBranchesInBank() {
        if(branchesList.isEmpty()) {
            System.out.println("The bank has no branches.");
            return;
        }
        for (Branch bankBranch : branchesList) {
            System.out.println("Branch name: " + bankBranch.getBranchName());
            bankBranch.printCustomersInBranch();
            bankBranch.printCustomersInBranch();
        }
    }

    public String getBankName() {
        return bankName;
    }

    public List<Branch> getBranchesList() {
        return branchesList;
    }
}

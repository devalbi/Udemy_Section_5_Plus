package devalbi.udemy.java_cert.section_8_challenge;

public class Exercise2 {

    public static void main(String[] args) {
        int kitty =  500;
        int[] loanRequests = new int[] {60,20,100,80,40,300,200,100};

        for(int i = 0; i < loanRequests.length; i++) {

            if(kitty <= 0) {
                System.out.println("Money in the kitty: " + kitty);
                System.out.println("The following loans could not be facilitated: ");
                while (i < loanRequests.length) {
                    System.out.println(loanRequests[i]);
                    i++;
                }
                break;
            }

            if(loanRequests[i] > kitty) {
                System.out.println("Loan Request Amount: " + loanRequests[i]);
                System.out.println("Insufficient funds in the kitty to grant the full loan of  " +
                        loanRequests[i] + "\n" +
                                "Granting loan of " + kitty);
                kitty = 0;
                continue;
            } else {
                System.out.println("Money in the kitty: " + kitty);
                System.out.println("Loan request for " +
                        loanRequests[i] +
                        " - Loan Request granted.");
                kitty -=loanRequests[i];

            }
        }
    }
}

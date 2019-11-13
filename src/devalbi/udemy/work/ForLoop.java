package devalbi.udemy.work;

public class ForLoop {
    public static void main(String[] args) {
        //can retype this line for other values, but leads to lots of code
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        for (double i = 2.0; i < 9.0; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        //Can use int instead of Double
        //Java will recognise using double in code and will change int to double
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
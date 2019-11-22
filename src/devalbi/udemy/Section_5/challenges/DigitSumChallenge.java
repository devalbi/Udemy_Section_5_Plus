package devalbi.udemy.Section_5.challenges;

public class DigitSumChallenge {
    public static void main(String[] args){
        sumDigits(369);
        sumDigits(9);
    }

    public static int sumDigits(int digits){
        if(digits < 10){
            System.out.println("Return value of -1");
            return -1;
        }

        String output = "Values of ";
        int newVal=0;

        while(digits > 0){
            newVal += (digits % 10);
            //digits = (digits / 10); same as below
            digits /= 10;
            output +=  digits + ", ";
        }

        output += " with total value of : " + newVal;
        System.out.println(output);

        return newVal;
    }
}

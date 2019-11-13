package devalbi.udemy.exercises;

public class EvenDigitSum_6 {
    public static void main(String[] args) {
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            System.out.println("Returns -1");
            return -1;
        }

        int newNumber = number;
        int evenNum = 0;
        int lastNum = 0;

        while (newNumber > 0)
        {
            lastNum = newNumber % 10;
            newNumber /=10;
            if(lastNum % 2 == 0)
            {
               evenNum += lastNum;
            }
        }
        System.out.println("Even Num is: " + evenNum);
        return evenNum;
    }
}

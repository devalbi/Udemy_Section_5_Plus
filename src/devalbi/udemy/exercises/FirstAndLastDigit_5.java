package devalbi.udemy.exercises;

public class FirstAndLastDigit_5 {

    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(10);
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            System.out.println("Returning -1");
            return -1;
        } else if (number < 10){
            System.out.println("if total is less than 10, Total is: " + (number*2));
            return number * 2;
        }

        int newNumber = 0;
        int firstNumber = 0;
        int counter = 0;

        while (number > 0) {
            newNumber = number % 10;
            if(counter == 0 ){
                firstNumber += newNumber;
            }

            counter++;
            number /=10;
        }
        System.out.println("LastNumber is " + newNumber + " and firstNumber is: " + firstNumber + " total is: " + (newNumber +  firstNumber));
        newNumber += firstNumber;
        return newNumber;
    }
}

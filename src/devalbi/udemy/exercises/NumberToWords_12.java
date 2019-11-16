package devalbi.udemy.exercises;

public class NumberToWords_12 {
    public static void main(String[] args) {
        numberToWords(15400);
    }

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        String output = "";
        int totalNumDigits = getDigitCount(number);
        if(number == 0) {
            System.out.println("Zero");
            return;
        }

        number = reverse(number);
        int reversedTotalNumDigits = getDigitCount(number);
        int digit = 0;
        while(number > 0){
            digit = number % 10;
            number /=10;
            switch (digit) {
                case 0:
                    output += "Zero ";
                    break;
                case 1:
                    output += "One ";
                    break;
                case 2:
                    output += "Two ";
                    break;
                case 3:
                    output += "Three ";
                    break;
                case 4:
                    output += "Four ";
                    break;
                case 5:
                    output += "Five ";
                    break;
                case 6:
                    output += "Six ";
                    break;
                case 7:
                    output += "Seven ";
                    break;
                case 8:
                    output += "Eight ";
                    break;
                case 9:
                    output += "Nine ";
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
        }
        if(reversedTotalNumDigits != totalNumDigits ){
            int times = totalNumDigits - reversedTotalNumDigits ;
            for(int i= 0; i < times; i++)
            {
                output += "Zero ";
            }
        }
        System.out.println(output);
    }


    public static int reverse(int numToReverse){
        int reversedNumber = 0;
        int digit = 0;

        while(numToReverse != 0)
        {
            digit = numToReverse % 10;
            numToReverse /=10;
            reversedNumber = (reversedNumber * 10) + digit;
        }
        return reversedNumber;
    }


    public static int getDigitCount(int numberToCount){
        int counter = 0;

        if(numberToCount < 0){
            return -1;
        } else if(numberToCount == 0){
            counter =1;
            return counter;
        }
        while(numberToCount > 0){
            numberToCount /= 10;
            counter ++;
        }
        return counter;
    }
}

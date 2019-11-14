package devalbi.udemy.exercises;

public class LastDigitChecker_8 {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 99));
    }

    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum){

        if(((firstNum < 10) || (firstNum > 1000)) || ((secondNum < 10) || (secondNum > 1000)) || ((thirdNum < 10) || (thirdNum > 1000))){
            return false;
        }

        int firstDigit = 0;
        int secondDigit = 0;
        int secondNumLoop = secondNum;
        int thirdDigit = 0;
        int thirdNumLoop = thirdNum;

        while(firstNum > 0){
            firstDigit = firstNum % 10;
            firstNum /=10;
            if (firstNum < 10) {
                while (secondNumLoop > 0) {
                    secondDigit = secondNumLoop % 10;
                    secondNumLoop /= 10;
                    if (secondNumLoop < 10) {
                        while (thirdNumLoop > 0) {
                            thirdDigit = thirdNumLoop % 10;
                            thirdNumLoop /= 10;
                            System.out.println("FirstDigit: " + firstDigit + ", SecondDigit: " + secondDigit + ", thirdNum: " + thirdDigit);
                            if (thirdNumLoop < 10) {
                                if ((firstDigit == secondDigit) || (firstDigit == thirdDigit) || (secondDigit == thirdDigit)) {
                                    System.out.println("FirstDigit: " + firstDigit + ", SecondDigit: " + secondDigit + ", thirdNum: " + thirdDigit);
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean isValid(int number)
    {
        if((number < 10) || (number > 1000)){
            return false;
        } else return true;
    }
}

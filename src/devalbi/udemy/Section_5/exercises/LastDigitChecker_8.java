package devalbi.udemy.Section_5.exercises;

public class LastDigitChecker_8 {

    public static void main(String[] args) {
       /* System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 99));*/
        System.out.println(hasSameLastDigit(62, 882, 772));
    }

    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum){

        if(((firstNum < 10) || (firstNum > 1000)) || ((secondNum < 10) || (secondNum > 1000)) || ((thirdNum < 10) || (thirdNum > 1000))){
            return false;
        }

        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;

        while(firstNum > 0){
            firstDigit = firstNum % 10;
            secondDigit = secondNum % 10;
            thirdDigit = thirdNum % 10;
            System.out.println("FirstDigit: " + firstDigit + ", SecondDigit: " + secondDigit + ", thirdNum: " + thirdDigit);
            if ((firstDigit == secondDigit) || (firstDigit == thirdDigit) || (secondDigit == thirdDigit)) {
                    return true;
                } else return false;
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

package devalbi.udemy.exercises;

public class ShareDigit_7 {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 33));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNum, int secondNum){
        if(((firstNum < 10) || (firstNum > 99)) || ((secondNum < 10) || (secondNum > 99))){
            return false;
        }

        int firstDigit = 0;
        int secondDigit = 0;
        int secondNumLoop = secondNum;

        while(firstNum > 0){
            firstDigit = firstNum % 10;
            firstNum /=10;
            while(secondNumLoop > 0){
                secondDigit = secondNumLoop % 10;
                secondNumLoop /=10;
                if(firstDigit == secondDigit)
                {
                    System.out.println("FirstDigit: " + firstDigit + ", SecondDigit: " + secondDigit );
                    return true;
                }
            }
            secondNumLoop = secondNum;
        }
        return false;
    }
}

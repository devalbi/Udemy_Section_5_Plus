package devalbi.udemy.exercises;

public class GreatestCommonDivisor_9 {

    public static void main(String[] args) {
        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(12, 30);
        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(81, 153);
    }

    public static int getGreatestCommonDivisor(int firstNum, int secondNum){
        if((firstNum < 10) || (secondNum < 10)){
            System.out.println("A number is less than 10");
            return -1;
        }

        int commonDiv = 0;
        int firstLoop = 0;
        int secondLoop = 0;

        for(int i = 1; i < firstNum; i++){
            firstLoop = firstNum % i;
            secondLoop = secondNum % i;
            if((firstLoop == 0) && (secondLoop == 0)){
                commonDiv = i;
            }
        }
        System.out.println("Common Divisor is : " + commonDiv);
        return commonDiv;
    }
}

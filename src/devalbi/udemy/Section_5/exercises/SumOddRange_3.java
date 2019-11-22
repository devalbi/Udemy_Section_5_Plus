package devalbi.udemy.Section_5.exercises;

public class SumOddRange_3 {

    public static void main(String[] args) {
        sumOdd(1,11);
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){

        if((start > end) ||  (start < 0)){
            return -1;
        }

        int sum = 0;
        for(int i = start; i < end+1; i++){
             if(isOdd(i)){
                 sum += i;
             }
        }
        System.out.println("Sum is: " + sum);
        return sum;
    }


}

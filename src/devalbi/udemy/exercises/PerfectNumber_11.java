package devalbi.udemy.exercises;

public class PerfectNumber_11 {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            System.out.println("Invalid Input");
            return false;
        }

        int addition = 0;
        for (int i = 1; i < number; i++) {
            if ((number % i) == 0) {
                addition += i;
                System.out.printf("Addition: " + addition + ". ");
            }
        }
        if (addition == number) {
            System.out.println("Number: " + number + " == " + addition + " addition ");
            return true;
        } else return false;
    }
}

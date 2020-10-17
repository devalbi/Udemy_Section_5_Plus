package devalbi.udemy.section_4_methods.exercises.decimalcomparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num1Int = (int) (num1 * 1000);
        int num2Int = (int) (num2 * 1000);

        if(num1Int == num2Int) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("false");
            return false;
        }

    }
}

package devalbi.udemy.section_4_methods.exercises.decimalcomparator;

public class Main {

    public static void main(String[] args) {

        DecimalComparator d = new DecimalComparator();

        d.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        d.areEqualByThreeDecimalPlaces(3.175, 3.176);
        d.areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }
}

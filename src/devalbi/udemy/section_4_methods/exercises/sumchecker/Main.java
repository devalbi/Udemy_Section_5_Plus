package devalbi.udemy.section_4_methods.exercises.sumchecker;

public class Main {

    public static void main(String[] args) {
        EqualSumChecker e = new EqualSumChecker();
         e.hasEqualSum(1, 1, 1);
         e.hasEqualSum(1, 1, 2);
         e.hasEqualSum(1, -1, 0);
    }
}

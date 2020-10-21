package devalbi.udemy.section_4_methods.exercises.equalityprinter;

public class Main {

    public static void main(String[] args) {

        IntEqualityPrinter intEqualityPrinter = new IntEqualityPrinter();

        intEqualityPrinter.printEqual(1, 1, 1);
        intEqualityPrinter.printEqual(1, 1, 2);
        intEqualityPrinter.printEqual(-1, -1, -1);
        intEqualityPrinter.printEqual(1, 2, 3);

    }
}

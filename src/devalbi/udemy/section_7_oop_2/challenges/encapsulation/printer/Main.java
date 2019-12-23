package devalbi.udemy.section_7_oop_2.challenges.encapsulation.printer;

public class Main {
    public static void main(String[] args) {
        Printer printerA = new Printer(100, 10, true);
        Printer printerB = new Printer(50, 0, false);
        Printer printerC = new Printer(0, 10, false);

        System.out.println("\n" + "Printer A");
        printerA.fillToner(10);
        printerA.PrintPaper(20);

        System.out.println("\n" + "Printer B");
        printerB.fillToner(10);
        printerB.PrintPaper(70);
        printerB.PrintPaper(20);


        System.out.println("\n" + "Printer C");
        printerC.fillToner(80);
        printerC.PrintPaper(70);


    }
}

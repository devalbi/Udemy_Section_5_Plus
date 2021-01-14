package devalbi.udemy.section_7_oop_2.challenges.encapsulation.printer;

public class Main {
    public static void main(String[] args) {
/*        Printer printerA = new Printer(100, 10, true);
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
        printerC.PrintPaper(70);*/

        Printer2 printerA = new Printer2(100, 10, true);
        Printer2 printerB = new Printer2(50, 0, false);
        Printer2 printerC = new Printer2(0, 10, false);

        System.out.println("\n" + "Printer A");
        printerA.addToner(10);
        printerA.printPages(20);

        System.out.println("\n" + "Printer B");
        printerB.addToner(10);
        printerB.printPages(70);
        printerB.printPages(20);


        System.out.println("\n" + "Printer C");
        printerC.addToner(80);
        printerC.printPages(70);


    }
}

package devalbi.udemy.section_7_oop_2.challenges.encapsulation.printer;

public class Printer {
    /*Aim
    * Create a class and demonstrate proper encapsulation
    * Class Called Printer
    * Fields: Toner Level, No Pages Printed, Duplex or Not
    * Method: Fill up toner, check does not go over 100%
    * Simulate print page, increase number of pages printed
    * */
    private int toner, pagesPrinter;
    private boolean duplex, canPrint = false;

    public Printer(int toner, int pagesPrinter, boolean duplex){
        this(toner, pagesPrinter);
        this.duplex = duplex;
    }

    public Printer(int toner, int pagesPrinter) {
        this(toner);
        if (pagesPrinter < 0) {
            this.pagesPrinter = 0;
        } else {
            this.pagesPrinter = pagesPrinter;
        }
    }

    public Printer(int toner) {
        if (toner > 100) {
            this.toner = 100;
            canPrint = true;
        } else if (toner < 0) {
            this.toner = 0;
        } else {
            this.toner = toner;
            canPrint = true;
        }
    }

    public void PrintPaper(int numberOfPages){
        if(numberOfPages <= 0){
            System.out.println("No pages set to print");
            return;
        }

        useToner(numberOfPages);
        if(canPrint) {
            if(duplex){
                numberOfPages = (numberOfPages / 2) + (numberOfPages % 2);
                System.out.println("Printer is a duplex so printing double sided");
            }
            pagesPrinter += numberOfPages;
            System.out.println("Printer has printed " + numberOfPages+ ", pages in total :" + pagesPrinter);
        }
    }

    public boolean useToner(int numberOfPages){
        if(numberOfPages > toner){
            System.out.println("Not enough Toner to print all pages. " + "\n" + "Please fill up toner levels");
            return canPrint = false;
        }
        toner -= numberOfPages;
        return canPrint = true;
    }

    public void fillToner(int topUp){
        if (toner > 100) {
            this.toner = 100;
            System.out.println("Toner is Full");
        } else if (toner < 0) {
            this.toner = 0;
            System.out.println("Cannot add negative value to toner");
        } else {
            this.toner = topUp;
            System.out.println("Toner Level: " + getToner() + "%");
        }
    }

    public int getToner() {
        return toner;
    }

    public int getPagesPrinter() {
        return pagesPrinter;
    }

    public void setPagesPrinter(int pagesPrinter) {
        this.pagesPrinter = pagesPrinter;
    }
}

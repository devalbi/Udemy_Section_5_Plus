package devalbi.udemy.section_7_oop_2.challenges.encapsulation.printer;

// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer2 {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer2() {
        this(100, 0, false);
    }

    public Printer2(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        if(tonerLevel <= 0 ) {
            tonerLevel = 0;
        } else this.tonerLevel = tonerLevel;
        if(numberOfPagesPrinted <= 0 ) {
            numberOfPagesPrinted = 0;
        } else this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void addToner(int toner) {

        if(toner < 0) {
            System.out.println("Cannot add a negative value of toner.");
        }

        System.out.println("Adding toner to printer.");

        if ((toner + tonerLevel) > 100) {
            System.out.println("Cannot add toner past 100.");
            tonerLevel = 100;
            System.out.println("Toner level is " + tonerLevel +"% full.");
        } else {
            tonerLevel += toner;
            System.out.println("Toner level is " + tonerLevel +"% full.");
        }
    }

    public void printPages(int pages) {
        System.out.println("Starting to print pages.");

        if(!isDuplex()) {
            numberOfPagesPrinted += pages;
            System.out.println("Printing " + pages + " pages. Total number of pages printed is now: " + numberOfPagesPrinted);
        } else {
            pages = (int) (Math.ceil(pages / 2));
            numberOfPagesPrinted += (pages);
        }

        System.out.println("Printing " + pages + " pages. Total number of pages printed is now: " + numberOfPagesPrinted);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}

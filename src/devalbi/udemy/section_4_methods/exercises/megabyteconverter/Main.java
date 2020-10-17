package devalbi.udemy.section_4_methods.exercises.megabyteconverter;

public class Main {

    public static void main(String[] args) {

        MegaBytesConverter m = new MegaBytesConverter();
        m.printMegaBytesAndKiloBytes(2500);
        m.printMegaBytesAndKiloBytes(-1024);
        m.printMegaBytesAndKiloBytes(5000);
    }
}

package devalbi.udemy.section_4_methods.exercises.megabyteconverter;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int kilobytes = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " +
                    megaBytes + " MB and " +
                    kilobytes + " KB");
        }
    }
}

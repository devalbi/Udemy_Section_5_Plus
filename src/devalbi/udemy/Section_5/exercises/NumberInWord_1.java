package devalbi.udemy.Section_5.exercises;

public class NumberInWord_1 {
    public static void main(String[] args) {
        printNumberInWord(5);
        printNumberInWord(-5);
    }

    public static void printNumberInWord(int num){
        switch(num){
            case 0:
                System.out.printf("ZERO");
                break;
            case 1:
                System.out.printf("ONE");
                break;
            case 2:
                System.out.printf("TWO");
                break;
            case 3:
                System.out.printf("THREE");
                break;
            case 4:
                System.out.printf("FOUR");
                break;
            case 5:
                System.out.printf("FIVE");
                break;
            case 6:
                System.out.printf("SIX");
                break;
            case 7:
                System.out.printf("SEVEN");
                break;
            case 8:
                System.out.printf("EIGHT");
                break;
            case 9:
                System.out.printf("NINE");
                break;

            default:
                System.out.println("OTHER");
                break;
        }
    }
}

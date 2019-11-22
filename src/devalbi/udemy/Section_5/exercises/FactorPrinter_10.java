package devalbi.udemy.Section_5.exercises;

public class FactorPrinter_10 {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number){
        String output ="";
        if(number < 1){
            output = "Invalid Value";
            System.out.println(output);
        }
        int divNum= 0;

        for(int i = 1; i <= number; i++){
            divNum = number % i;
            if(divNum == 0){
                output = String.valueOf(i);
                System.out.println(output);
            }
        }
    }
}

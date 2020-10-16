package devalbi.udemy.section_3_primitives.challenge.operators;

public class Main {

    public static void main(String[] args) {

        double firstVar = 20.00d;
        double secondVar = 80.00d;

        double thirdVar = (firstVar + secondVar) * 100.00;
        thirdVar = thirdVar % 40.00d;

        boolean isRemainder = (thirdVar == 0) ? true : false;
/*
        if(thirdVar == 0) {
            isRemainder = true;
        } else {
            isRemainder =  false;
        }
*/

        if(!isRemainder) {
            System.out.println("Got Some Remainder");
        }

    }
}

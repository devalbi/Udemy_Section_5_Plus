package devalbi.udemy.section_16_lambda_expressions.challenge.challengeset1;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

//        Challenge 1: Write as a Lambda
//        @Override
//        public void run() {
//            String myString = "Let's split this up into an array";
//            String[] parts = myString.split(" ");
//            for (String part: parts) {
//                System.out.println(part);
//            }
//        };

        String myString = "Let's split this up into an array";
        Runnable r = () -> {
            String myString1 = "Let's split this up into an array";
            String[] parts = myString1.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };



//        Challenge 2: Make into a lambda expression
//        StringBuilder returnVal = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (i % 2 == 1) {
//                returnVal.append(s.charAt(i));
//            }
//        }
//        return returnVal.toString();
//    }

        Function<String, String> stringFunction   = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };



        // Challenge 3: Make into a lambda that will execute the code with 123456789
        System.out.println(stringFunction.apply("1234567890"));
        System.out.println("====================================");



        //Challenge 5: Call the lamda from a method
        String functionTester = everySecondCharacter(stringFunction, "1234567890");
        System.out.println(functionTester);
        System.out.println("====================================");



        // Challenge 6: write lambda that uses Supplier interface to return a String
        // and assign result to String object iLoveJava
        Supplier<String> iLoveJava = () -> "I Love Java";



        // Challenge 7: assign iLoveJva to variable and print to console
        String iLoveJavaVar = iLoveJava.get();
        System.out.println(iLoveJavaVar);

    }


    // Challenge 4: create method, using the function as an input param
    private static String everySecondCharacter(Function<String, String> stringFunction, String string) {
        return stringFunction.apply(string);
    }


}


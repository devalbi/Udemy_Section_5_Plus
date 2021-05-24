package devalbi.udemy.section_16_lambda_expressions.challenge.challengeset1;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        //Write as a Lambda
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
            for (String part: parts) {
                System.out.println(part);
            }
        };
       // r.run();

        Consumer<String> runnableString = s1 -> {
            String[] parts = s1.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        runnableString.accept(myString);

        //Arrays.stream(myString)
    }
}


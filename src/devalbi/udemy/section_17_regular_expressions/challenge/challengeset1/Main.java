package devalbi.udemy.section_17_regular_expressions.challenge.challengeset1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //Challenge 1, make a regex that matches the challenge1 string.
        String challenge1 = "I want a bike";
        System.out.println(challenge1.matches("I want a bike"));


        //Challenge 2, make a regex that matches the challenge1 and challenge string.
        String challenge2 = "I want a ball";
        System.out.println(challenge1.matches("I want a b[a-z]*"));
        System.out.println(challenge2.matches("I want a b(?i)\\w*"));


        //Challenge 3, use a pattern and Match class to do the same as Challenge 1 and 2
        Pattern pattern = Pattern.compile("I want a \\w.*");
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());

        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());


        //Challenge 4, replace all blank spaces with an underscore
        String challenge4 = "Replace all the blanks with underscrores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));


        //Challenge 5, match string
        String challenge5 = "aaabccccccdddefffg";
        System.out.println(challenge5.matches("[a-g]+"));

        //Challenge 6, only match challenge 5 string in it's entirety.
        System.out.println(challenge5.matches("[a-g]{18}"));
        System.out.println(challenge5.matches("(^a{3}bc{6}d{3}ef{3}g$)"));

        //Challenge 7, match any string with pattern of characters, followed by period, followed by numbers: abc.123

        String challenge7 = "aBcd.135";
        System.out.println(challenge7.matches("\\w+.?\\d+"));
        System.out.println(challenge7.matches("[a-zA-Z]*.?[1-9]*"));
    }
}

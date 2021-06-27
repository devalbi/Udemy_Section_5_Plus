package devalbi.udemy.section_17_regular_expressions.challenge.challengeset2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        //Challenge 1(8), match groups with pattern of abc.123
        Pattern pattern1 = Pattern.compile("\\w+.?(\\d+)+");
        Matcher matcher1 = pattern1.matcher("abc.135uqz.7tzik.999");
       // System.out.println(matcher.matches());
        while(matcher1.find()){
            System.out.println("Occurence: + " + matcher1.group(1));
        }


        //Challenge 2(9), match groups that are separated by tab.
        // Last match should be followed by newline.
        String challenge2 = "abcd.135\tuqz.7\ttzik.999\n";
        Pattern pattern2 = Pattern.compile("\\w+\\.(\\d+)\\s");
        Matcher matcher2 = pattern2.matcher(challenge2);



        //Challenge 3 (10), print out index of start and end of digit group
        while (matcher2.find()){
            System.out.println("Occurence: + " +
                    matcher2.start(1) + " " +
                    (matcher2.end(1)-1));
        }
    }
}

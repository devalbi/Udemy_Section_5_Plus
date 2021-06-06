package devalbi.udemy.section_16_lambda_expressions.challenge.challengeset2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {


        //Challenge 9: sort and print names with fist letter as uppercase using lambda
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        //9.1 My Solution
        Consumer<List<String>> sortTop15Names = s -> {

            List newSortedTop15Names = new ArrayList();

            for (String name : topNames2015) {
                String firstLetter = name.substring(0, 1);
                String restOfName = name.substring(1);

                firstLetter = firstLetter.toUpperCase();
                name = firstLetter + restOfName;
                newSortedTop15Names.add(name);
               // System.out.println(name);
            }
            newSortedTop15Names.stream().sorted().forEach(System.out::println);
        };

        sortTop15Names.accept(topNames2015);

        System.out.println("\n===============================\n");
        //9.2 Course Solution
//        List<String> top15NamesUpperCase = new ArrayList<>();
//        topNames2015.forEach(name -> top15NamesUpperCase.add(
//                name.substring(0, 1).toUpperCase() + name.substring(1)));
//        top15NamesUpperCase.sort((s1, s2) -> s1.compareTo(s2));
//        top15NamesUpperCase.forEach(System.out::println);



        //Challenge 10 make code use method reference Class::methodName
        List<String> top15NamesUpperCase = new ArrayList<>();
        topNames2015.forEach(name -> top15NamesUpperCase.add(
                name.substring(0, 1).toUpperCase() + name.substring(1)));
        top15NamesUpperCase.sort(String::compareTo);
        top15NamesUpperCase.forEach(System.out::println);



        System.out.println("\n===============================\n");
        //Challenge 11 sort and print names with fist letter as uppercase using Stream
        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);



        System.out.println("\n===============================\n");
        //Challenge 12 sort and print names with fist letter as uppercase using Stream
        //And only print out beginning with "A" and the count
        long namesBeginningWithAtopNames2015 = topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println(namesBeginningWithAtopNames2015);




        System.out.println("\n===============================\n");
        //Challenge 13 use peek in the stream
        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .count();

    }
}

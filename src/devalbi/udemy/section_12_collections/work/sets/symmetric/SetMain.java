package devalbi.udemy.section_12_collections.work.sets.symmetric;

import javax.lang.model.element.ModuleElement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {

        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes); //Async bulk operation - add all bar duplicates
        System.out.println("Union contains " + union.size() + " elements");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes); //Async bulk operation - add common items only/ removes uncommon objects
        System.out.println("Intersection contains " + intersection.size());
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        /*s1.containsAll(s2) — returns true if s2 is a subset of s1. (s2 is a subset of s1 if set s1 contains all of the elements in s2.) - non-destructive
        s1.addAll(s2) — transforms s1 into the union of s1 and s2. (The union of two sets is the set containing all of the elements contained in either set.)
        s1.retainAll(s2) — transforms s1 into the intersection of s1 and s2. (The intersection of two sets is the set containing only the elements common to both sets.)
        s1.removeAll(s2) — transforms s1 into the (asymmetric) set difference of s1 and s2. (For example, the set difference of s1 minus s2 is the set containing all of the elements found in s1 but not in s2.)*/

        //Asym is s1.doSomething(S2) is not the same as s2.doSomething(s1)
        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords)); //Used to convert Array (Collection Type) to Set

        for (String s : words) {
            System.out.println(s);
        }

        //Converting Array to Sets
        //s1.addAll(s2) — transforms s1 into the union of s1 and s2. (The union of two sets is the set containing all of the elements contained in either set.)
        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);


        //Example of Symmetric Sets
        //Union - intersection
        //s1.retainAll(s2) — transforms s1 into the intersection of s1 and s2. (The intersection of two sets is the set containing only the elements common to both sets.)
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest =  new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        //s1.removeAll(s2) — transforms s1 into the (asymmetric) set difference of s1 and s2. (For example, the set difference of s1 minus s2 is the set containing all of the elements found in s1 but not in s2.)
        System.out.println("Symmetric Difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        //s1.containsAll(s2) — returns true if s2 is a subset of s1. (s2 is a subset of s1 if set s1 contains all of the elements in s2.) - non-destructive
        if(nature.containsAll(divine)) {
            System.out.println("Divine is a sub-set of nature");
        }
        if(nature.containsAll(intersectionTest)) {
            System.out.println("intersection is a sub-set of nature");
        }

        if(divine.containsAll(intersectionTest)) {
            System.out.println("intersection is a sub-set of divine");
        }
    }

        private static void printSet(Set<String> set) {
            System.out.print("\t");
            for(String s : set) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }

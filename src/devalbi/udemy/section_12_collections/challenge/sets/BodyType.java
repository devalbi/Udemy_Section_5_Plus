package devalbi.udemy.section_12_collections.challenge.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public interface BodyType {

    static String MOON = "moon";
    static String PLANET = "planet";
    static String STAR = "star";
    static String SATELLITE = "satellite";

    public static Set<String> bodyTypes = new HashSet<>(Arrays.asList("star", "moon", "planet", "satellite"));

}

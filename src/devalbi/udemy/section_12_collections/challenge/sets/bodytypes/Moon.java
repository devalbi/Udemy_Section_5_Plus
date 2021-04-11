package devalbi.udemy.section_12_collections.challenge.sets.bodytypes;

import devalbi.udemy.section_12_collections.challenge.sets.BodyType;
import devalbi.udemy.section_12_collections.challenge.sets.HeavenlyBody;

public class Moon extends HeavenlyBody {

    private static final BodyType starBodyType = BodyType.MOON;

    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, starBodyType);
    }

    public void printBodType() {
        System.out.println(getBodyType());
    }
}

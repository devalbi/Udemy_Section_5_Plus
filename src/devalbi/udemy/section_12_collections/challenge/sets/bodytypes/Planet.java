package devalbi.udemy.section_12_collections.challenge.sets.bodytypes;

import devalbi.udemy.section_12_collections.challenge.sets.BodyType;
import devalbi.udemy.section_12_collections.challenge.sets.HeavenlyBody;

public class Planet  extends HeavenlyBody {

    private static final BodyType starBodyType = BodyType.PLANET;

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, starBodyType);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        if(satellite.getBodyType().equals(BodyType.MOON)) {

            return super.getSatellites().add(satellite);

        }

        return false;
    }

    public void printBodType() {
        System.out.println(getBodyType());
    }
}

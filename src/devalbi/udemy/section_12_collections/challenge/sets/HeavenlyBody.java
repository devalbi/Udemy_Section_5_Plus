package devalbi.udemy.section_12_collections.challenge.sets;

import java.util.HashSet;
import java.util.Set;

//Final class cannot be sub-classed
public final class HeavenlyBody implements BodyType{

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellities;
    private String bodyType;

    public HeavenlyBody(String name, double orbitalPeriod, String bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellities = new HashSet<>();
        addBodyType(bodyType);
    }

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellities = new HashSet<>();
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellities.add(moon);
    }

    public Set<HeavenlyBody> getSatellities() {
        return new HashSet<HeavenlyBody>(this.satellities);
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    //Overwriting equals() and hasCode() methods
    //can be AutoGenerated
    @Override
    public boolean equals(Object obj) {
        //Object equals itself, return true
        if (this == obj) {
            return true;
        }
        //for debugging
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode called");
        return this.name.hashCode() + 57;
    }

    public boolean addBodyType(String bodyType){

        if(bodyTypes.contains(bodyType.toLowerCase()))
        {
            //BodyType.MOON;
            this.bodyType = bodyType;
            return true;
        } else {
            System.out.println("Body Type does not exist");
            return false;
        }
    }
}
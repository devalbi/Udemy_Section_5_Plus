package devalbi.udemy.section_12_collections.challenge.sets;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyType bodyType;
    private final String keyValue;

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;

        keyValue = this.name.toUpperCase(Locale.ROOT) + this.bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody satellite) {
        if(satellite.equals(null)) {
            return false;
        } else {
            return this.satellites.add(satellite);
        }
    }

    public String getKeyValue() {
        return keyValue;
    }

    public static String makeKeyValue(String name, BodyType bodyType) {
        return name.toUpperCase(Locale.ROOT) + bodyType;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if ((obj instanceof HeavenlyBody)) {
            HeavenlyBody thisObject = (HeavenlyBody) obj;
            if(this.bodyType.equals(((HeavenlyBody) obj).getBodyType()))
                return this.name.equals(thisObject.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.bodyType.hashCode() + 57;
    }
}

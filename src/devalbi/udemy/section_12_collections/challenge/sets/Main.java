package devalbi.udemy.section_12_collections.challenge.sets;

import devalbi.udemy.section_12_collections.challenge.sets.bodytypes.Moon;
import devalbi.udemy.section_12_collections.challenge.sets.bodytypes.Planet;
import devalbi.udemy.section_12_collections.challenge.sets.bodytypes.Star;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody star = new Star("Sol",1);
        solarSystem.put(star.getName(), star);



        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKeyValue(), temp);
        planets.add(temp);
        star.addSatellite(temp);

        temp = new Moon("Venus", 225);
        solarSystem.put(temp.getKeyValue(), temp);
        planets.add(temp);

        //5. Two bodies with the same name but different designations can be added to the same set.
        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKeyValue(), temp);
        planets.add(temp);
        star.addSatellite(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKeyValue(), temp);
        planets.add(temp);
        star.addSatellite(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKeyValue(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Solmoon", 2);
        solarSystem.put(tempMoon.getKeyValue(), tempMoon);
        star.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKeyValue(), temp);
        planets.add(temp);
        star.addSatellite(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKeyValue(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKeyValue(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKeyValue(), temp);
        planets.add(temp);
        star.addSatellite(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKeyValue(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter


        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKeyValue(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKeyValue(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKeyValue(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKeyValue(), temp);
        planets.add(temp);
        star.addSatellite(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKeyValue(), temp);
        planets.add(temp);
        star.addSatellite(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKeyValue(), temp);
        planets.add(temp);
        star.addSatellite(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKeyValue(), temp);
        planets.add(temp);
        star.addSatellite(temp);


        /*5. Two bodies with the same name but different designations can be added to the same set.*/
        tempMoon = new Moon("Pluto", 16.7);
        solarSystem.put(tempMoon.getKeyValue(), tempMoon);
        temp.addSatellite(tempMoon);

        System.out.println("Satellites of the Sun");
        for (HeavenlyBody satellite : star.getSatellites()) {
            if(satellite.getBodyType().equals(BodyType.PLANET)) {
                System.out.println("\t" + satellite.getName());
            } else if (satellite.getBodyType().equals(BodyType.MOON)) {
                System.out.println("\t" + satellite.getName());
            }
        }

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        String tempKeyValue = HeavenlyBody.makeKeyValue("Jupiter", BodyType.PLANET);
        HeavenlyBody body = solarSystem.get(tempKeyValue);
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody jupiterMoons : body.getSatellites()) {
            System.out.println("\t" + jupiterMoons.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }
        for(HeavenlyBody moon : star.getSatellites()) {
            if(moon.getBodyType().equals(BodyType.MOON)) {
                moons.add(moon);
            }
        }

        System.out.println("All Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

       /* 3. Attempting to add a duplicate to a Set must result in no change to the set (so
        the original value is not replaced by the new one).*/
        HeavenlyBody pluto = new Planet("Pluto", 842);
        planets.add(pluto);

        //Java will not see these two as equals (hashcode will be different objects are not identical)
        //Therefore will allow duplicates as OOTB hashSets.equals() compares the object the references equals to,
        //this is the reason to overwrite the value.

        for (HeavenlyBody planet : planets) {
            System.out.println(planet.getName() + " " + planet.getOrbitalPeriod());
        }

        //Difference equals between object and String
        //String Overwrites Object method
        Object o = new Object();
        o.equals(o);
        "pluto".equals("");

        System.out.println();

        testIfSymmetrical();


        String tempKeyValuePlanet = HeavenlyBody.makeKeyValue("Venus", BodyType.PLANET);
        String tempKeyValueMoon = HeavenlyBody.makeKeyValue("Venus", BodyType.MOON);
        for(Map.Entry<String, HeavenlyBody> bodies : solarSystem.entrySet()) {
            if((bodies.getKey().equals(tempKeyValuePlanet)) || (bodies.getKey().equals(tempKeyValueMoon))) {
                System.out.println(bodies.getValue().getName());
            }
        }
    }

    public static void testIfSymmetrical(){
        // a.equals(b) must return the same result as b.equals(a) - equals is symmetric.
        Planet planet1 = new Planet("Pluto", 182);
        Planet planet2 = new Planet("Pluto", 182);
        Moon moon1 = new Moon("Pluto", 188);

        System.out.println(planet1.equals(planet2));
        System.out.println(planet2.equals(planet1));
        System.out.println(moon1.equals(planet1));
    }


}


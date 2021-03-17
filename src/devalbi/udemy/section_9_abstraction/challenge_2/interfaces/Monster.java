package devalbi.udemy.section_9_abstraction.challenge_2.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;
    private List<String> monsterList;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;

        monsterList = new ArrayList<>();
    }

    @Override
    public List<String> write() {
        return monsterList;
    }

    @Override
    public void read(List<String> stringList) {
        if(stringList == null) {
            return;
        }

        if(stringList.isEmpty()) {
            return;
        }

        stringList.add(getName());
        stringList.add(String.valueOf(getHitPoints()));
        stringList.add(String.valueOf(getStrength()));
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}

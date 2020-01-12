package devalbi.udemy.section_9_abstraction.challenge.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Truck  implements ISaveable{
    private String make, model;
    private int towingCapacity;

    public Truck(String make, String model, int towingCapacity) {
        this.make = make;
        this.model = model;
        this.towingCapacity = towingCapacity;
    }

    @Override
    public void read(List<String> savedValues) {
        if((savedValues.size()> 0) && (savedValues != null)){
            this.make = savedValues.get(0);
            this.model = savedValues.get(1);
            this.towingCapacity = Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.make);
        values.add(1, this.model);
        values.add(2, String.valueOf(this.towingCapacity));

        return values;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", towingCapacity=" + towingCapacity +
                '}';
    }
}

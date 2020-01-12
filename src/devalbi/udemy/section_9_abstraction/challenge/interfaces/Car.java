package devalbi.udemy.section_9_abstraction.challenge.interfaces;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Car  implements ISaveable{

    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() != 0){
            this.make = savedValues.get(0);
            this.model = savedValues.get(1);
        }
    }

    @Override
    public List<String> write() {
        List<String> values =  new ArrayList<String>();
        values.add(0, this.make);
        values.add(1, this.model);

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


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

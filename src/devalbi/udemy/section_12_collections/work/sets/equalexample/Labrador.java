package devalbi.udemy.section_12_collections.work.sets.equalexample;

public class Labrador extends Dog {


    public Labrador(String name) {
        super(name);
    }

    //Overriding prevents it being compared against parent class rover.equals(rover2)
/*    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj instanceof Labrador) {
            String objName = ((Labrador) obj).getName();
            return this.getName().equals(objName);
        }

        return false;
    }*/

}

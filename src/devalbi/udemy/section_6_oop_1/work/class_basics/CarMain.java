package devalbi.udemy.section_6_oop_1.work.class_basics;

public class CarMain {

    public static void main(String[] args) {

        //Car is class
        //Porsche is Object
        Car porsche = new Car();

        //Will return null as String is null by default
        System.out.println(porsche.getModel());

        //Will set as Null due to validation in class.
        porsche.setModel("Carrera");

        //Will return model now that it is populated.
        System.out.println(porsche.getModel());

        //If model was public could do
        //Against Encapsulation.
        //porsche.model = "911"
        porsche.setModel("911");

        //Will return model now that it is populated.
        System.out.println(porsche.getModel());
    }
}

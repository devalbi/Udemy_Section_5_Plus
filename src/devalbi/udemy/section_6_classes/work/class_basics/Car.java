package devalbi.udemy.section_6_classes.work.class_basics;

public class Car {
    //Fields - state of class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //have 2 model,
    //A paramater in mathod,
    //and field in class. "this.model" refers to field.
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("911") || validModel.equals("Focus")){
            this.model = model;
        } else
            {
                model =  null;
            }
    }

    //returns value of field model
    public String getModel(){
        return this.model;
    }
}

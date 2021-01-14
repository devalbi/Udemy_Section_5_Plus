package devalbi.udemy.section_7_oop_2.challenges.oopfinal2.fillings;

public class BaseFilling {
    private String fillingName;
    private double cost;


    public BaseFilling(String fillingName) {
        this(fillingName, 0.50d);
    }

    public BaseFilling(String fillingName, double cost) {
        this.fillingName = fillingName;
        if(cost <= 0) {
            this.cost = 0.50d;
        } else this.cost = cost;
    }

    public String getFillingName() {
        return fillingName;
    }

    public double getCost() {
        return cost;
    }
}

package devalbi.udemy.section_7_oop_2.challenges.oopfinal2.extras;

public class ExtraBase {

    private String extraName;

    public ExtraBase(){
        this("Extra Base");
        getExtraName();
    }

    public ExtraBase(String extraName) {
        this.extraName =  extraName;
        getExtraName();
    }

    public String getExtraName() {
        System.out.println(extraName + " added to deluxe order.");
        return extraName;
    }
}

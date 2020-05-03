package devalbi.udemy.section_8_lists.work.abstractclass;

public interface CanFly {

    void fly();

    default String example(){
        return "Example method being implemented in Interface";
    }

    private String example1(){
        return "Example method being implemented in Interface";
    }
}

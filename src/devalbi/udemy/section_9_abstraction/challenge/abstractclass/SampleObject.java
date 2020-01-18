package devalbi.udemy.section_9_abstraction.challenge.abstractclass;

public class SampleObject extends Node {
    private String stringValue;
    private int intValue;

    public SampleObject(String stringValue) {
        super(stringValue);
        this.stringValue = stringValue;
    }

    public SampleObject(int intValue) {
        super(intValue);
        this.intValue = intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public int getIntValue() {
        return intValue;
    }
}

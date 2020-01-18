package devalbi.udemy.section_9_abstraction.challenge.abstractclass;

public class Main {

    public static void main(String[] args) {
/*        SampleObject sampleObject1 = new SampleObject(1);
        SampleObject sampleObject2 = new SampleObject("Three");
        SampleObject sampleObject3 = new SampleObject(7);
        SampleObject sampleObject4 = new SampleObject("Joe Bloggs");
        SampleObject sampleObject5 = new SampleObject(1);*/

        SampleObject sampleObject1 = new SampleObject("1");
        SampleObject sampleObject2 = new SampleObject("5");
        SampleObject sampleObject3 = new SampleObject("3");
        SampleObject sampleObject4 = new SampleObject("4");
        SampleObject sampleObject5 = new SampleObject(2);

        ListClass listClass = new ListClass();
        listClass.addItemToList(sampleObject1);
        listClass.addItemToList(sampleObject2);
        listClass.addItemToList(sampleObject3);
        listClass.addItemToList(sampleObject4);
        listClass.addItemToList(sampleObject5);

        listClass.printList();

        listClass.removeNode(sampleObject2);
        listClass.printList();
    }
}

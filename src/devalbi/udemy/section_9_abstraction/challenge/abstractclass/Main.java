package devalbi.udemy.section_9_abstraction.challenge.abstractclass;

public class Main {

    public static void main(String[] args) {
/*        SampleObject sampleObject1 = new SampleObject(1);
        SampleObject sampleObject2 = new SampleObject("Three");
        SampleObject sampleObject3 = new SampleObject(7);
        SampleObject sampleObject4 = new SampleObject("Joe Bloggs");
        SampleObject sampleObject5 = new SampleObject(1);*/

        SampleObject sampleObject1 = new SampleObject("Darwin");
        SampleObject sampleObject2 = new SampleObject("Gort");
        SampleObject sampleObject3 = new SampleObject("Perth");
        SampleObject sampleObject4 = new SampleObject("Melbourne");
        SampleObject sampleObject5 = new SampleObject("Canberra");
        SampleObject sampleObject6 = new SampleObject("Adelaide");
        SampleObject sampleObject7 = new SampleObject("Sydney");
        SampleObject sampleObject8 = new SampleObject("Canberra");
        SampleObject sampleObject9 = new SampleObject("Coolock");
        SampleObject sampleObject10 = new SampleObject("Bray");
        SampleObject sampleObject11 = new SampleObject("Toronto");
        SampleObject sampleObject12 = new SampleObject("Sale");
        SampleObject sampleObject13 = new SampleObject("Seattle");

/*        ListClass listClass = new ListClass();
        listClass.addItemToList(sampleObject1);
        listClass.addItemToList(sampleObject2);
        listClass.addItemToList(sampleObject3);
        listClass.addItemToList(sampleObject4);
        listClass.addItemToList(sampleObject5);
        listClass.addItemToList(sampleObject6);
        listClass.addItemToList(sampleObject7);
        listClass.addItemToList(sampleObject8);

        listClass.printList();

        listClass.removeNode(sampleObject2);
        listClass.printList();*/

        BinarySearchTree bst = new  BinarySearchTree();

        bst.addItemToList(sampleObject1);
        bst.addItemToList(sampleObject2);
        bst.addItemToList(sampleObject3);
        bst.addItemToList(sampleObject4);
        bst.addItemToList(sampleObject5);
        bst.addItemToList(sampleObject6);
        bst.addItemToList(sampleObject7);
        bst.addItemToList(sampleObject9);
        bst.addItemToList(sampleObject10);
        bst.addItemToList(sampleObject11);
        bst.addItemToList(sampleObject12);
        bst.addItemToList(sampleObject13);

        System.out.println("\n");
        bst.printList();
        System.out.println("\n");
        bst.removeNode(sampleObject3);
        bst.printList();

    }
}

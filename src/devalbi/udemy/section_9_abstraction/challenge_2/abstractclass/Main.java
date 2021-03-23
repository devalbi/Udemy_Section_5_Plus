package devalbi.udemy.section_9_abstraction.challenge_2.abstractclass;

public class Main {

    public static void main(String[] args) {
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

        Node listItem1 = new Node(sampleObject1);
        Node listItem2 = new Node(sampleObject2);
        Node listItem3 = new Node(sampleObject3);
        Node listItem4 = new Node(sampleObject4);
        Node listItem5 = new Node(sampleObject5);
        Node listItem6 = new Node(sampleObject6);
        Node listItem7 = new Node(sampleObject7);
        Node listItem8 = new Node(sampleObject8);
        Node listItem9 = new Node(sampleObject9);
        Node listItem10 = new Node(sampleObject10);
        Node listItem11 = new Node(sampleObject11);
        Node listItem12 = new Node(sampleObject12);
        Node listItem13 = new Node(sampleObject13);


       MyLinkedList myLinkedList = new MyLinkedList(listItem1);
        myLinkedList.addItem(listItem2);
        myLinkedList.addItem(listItem3);
        myLinkedList.addItem(listItem4);
        myLinkedList.addItem(listItem5);
        myLinkedList.addItem(listItem6);
        myLinkedList.addItem(listItem7);
        myLinkedList.addItem(listItem8);
        myLinkedList.addItem(listItem9);
        myLinkedList.addItem(listItem10);
        myLinkedList.addItem(listItem11);
        myLinkedList.addItem(listItem12);
        myLinkedList.addItem(listItem13);

        myLinkedList.traverse(listItem1);

        myLinkedList.removeItem(listItem1);


        myLinkedList.traverse(listItem1);
        myLinkedList.traverse(listItem2);
    }
    
}

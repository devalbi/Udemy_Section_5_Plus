package devalbi.udemy.section_9_abstraction.challenge.abstractclass;

public class ListClass extends Node {

    private boolean nextNodeAvailable;
    private boolean previousNodeAvailable;
    private boolean isEmpty;

    public ListClass(Object o) {
        super(o);
        this.nextNodeAvailable = false;
        this.previousNodeAvailable = false;
        this.isEmpty = true;
    }

    public void addItemToList(Node node){

        if(isEmpty) {
            node.setNext(null);
            node.setPrevious(null);
            isEmpty = false;

            return;
        }

        /*
        * TODO
        *  1. Figure out how to reference head Node
        *  2. Use CompareTo to compare the 2 nodes
        *  3. Look at changing to accept 2 Nodes compartTo(Node node1, Node node 2)?
        *  4. Determine Head, Tail, replace, insert, remove
        *  5. Make Node instance for Head and Tail to start and end link */
        int result = compareTo(node);
        if((!nextNodeAvailable) && (!previousNodeAvailable)){

        }
    }
}

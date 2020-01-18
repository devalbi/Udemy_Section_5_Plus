package devalbi.udemy.section_9_abstraction.challenge.abstractclass;

public class ListClass extends Node {

    private boolean isEmpty;
    private Node head;
    private Node tail;

    public ListClass() {
        this.isEmpty = true;
    }

    public void addItemToList(Node node){

        /*Checks to see if List is Empty
        * If Empty, enter node as Head*/
        if(isEmpty) {
            isEmpty = false;
            head = node;
            System.out.printf("Head Node " + node.getObjectValue() + " is added.\n");
            return;
        }

        boolean isNodeAdded = false;
        Node currentNode = head;
        while(!isNodeAdded){
            int result = compareTo(node, currentNode); //Compares values for sorting
            if(result == 0){ //Prevents Duplicate entries,
                System.out.println("Node is already in Linked List.\n");
                isNodeAdded = true;
                break;
            } else if(result < 0){ //If node less than current node, add in node before current node.
                insertNode(node, currentNode);
                System.out.printf("Node " + node.getObjectValue() + " is added.\n");
                isNodeAdded = true;
                break;
            }
            if(currentNode.hasNextNode()) {
                currentNode = currentNode.getNextNode(); //Gets Next node for the next loop.
            } else {
/*               If Node has no next Object then it is the Tail.
                 Therefore we can add new node object to the end of the list
                 and make it the new Tail object*/
                insertNode(node, currentNode);
                isNodeAdded = true;
            }

        }
    }

    private void insertNode(Node node,  Node currentNode) {
        if (currentNode == head){
            if(!head.hasNextNode()){
                //Sets Head to Tail and new node to Head
                tail = head;
                tail.setPreviousNode(node);
                head = node;
                head.setNextNode(tail);

            } else {
                currentNode.setPreviousNode(node);
                head = node;
                head.setNextNode(currentNode);

            }
        } else if(currentNode == tail) {
            currentNode.setNextNode(node);
            tail = node;
            tail.setPreviousNode(currentNode);

        } else {
            Node linkNode = currentNode.getPreviousNode();
            linkNode.setNextNode(node);
            node.setPreviousNode(linkNode);
            currentNode.setPreviousNode(node);
            node.setNextNode(currentNode);
        }
    }

    public void removeNode(Node node) {
        if (node == head){
            if(!head.hasNextNode()){
                head = node;
                isEmpty = true;

            } else {
                head = head.getNextNode();
                head.setPreviousNode(null);
            }
        } else if(node == tail) {
            tail = tail.getPreviousNode();
            tail.setNextNode(null);
        } else {
            Node nextNode = node.getNextNode();
            nextNode.setPreviousNode(node.getPreviousNode());

            Node previousNode = node.getPreviousNode();
            previousNode.setNextNode(node.getNextNode());
        }
    }

    public void printList() {
        Node currentNode = head;
        while(currentNode.hasNextNode())
        {
            System.out.println(currentNode.toString());
            currentNode = currentNode.getNextNode();
        }
        System.out.println(tail.toString() + "\n");
    }

}

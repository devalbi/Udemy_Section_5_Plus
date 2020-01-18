package devalbi.udemy.section_9_abstraction.challenge.abstractclass;

public abstract class Node {

    private Node previous = null;
    private Node next = null;
    private Object objectValue;

    public Node(Object object) {
        this.objectValue = object;
    }

    public Node() {
    }


    public Node getNextNode() {
        if (hasNextNode()) {
            Node node = next;
            return node;
        }

        return null;
    }

    public Node getPreviousNode() {
        if (hasPreviousNode()) {
            Node node = previous;
            return node;
        }

        return null;
    }

    public boolean hasNextNode(){
        if(next == null){
            return false;
        }

        return true;
    }
    public boolean hasPreviousNode(){
        if(previous == null){
            return false;
        }

        return true;
    }

    public int compareTo(Node node, Node currentNode) {
        String objectStrValue = String.valueOf(currentNode.getObjectValue());
        int compareValue = objectStrValue.compareTo(String.valueOf(node.getObjectValue()));
        return compareValue;
    }


    public Object getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(String s){
        this.objectValue = s;
    }

    public void setObject(int s){
        this.objectValue = s;
    }

    public void setObject(double s){
        this.objectValue = s;
    }

    public void setPreviousNode(Node previous) {
        this.previous = previous;
    }

    public void setNextNode(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "objectValue= " + this.objectValue +
                '}';
    }
}

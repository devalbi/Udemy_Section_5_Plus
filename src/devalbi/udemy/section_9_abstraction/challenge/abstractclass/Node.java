package devalbi.udemy.section_9_abstraction.challenge.abstractclass;

public abstract class Node {

    private Node previous = null;
    private Node next = null;
    private Node right = null;
    private Node left = null;
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

    public int compareTo(Node node) {
        if(node != null) {
            String objectStrValue = String.valueOf(this.getObjectValue());
            int compareValue = objectStrValue.compareTo(String.valueOf(node.getObjectValue()));
/*            int compareValue =  ((String) this.getObjectValue()).compareTo((String) node.getObjectValue()); Tim's way of doing it*/
            return compareValue;
        }

        return -1;
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

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "Node{" +
                "objectValue= " + this.objectValue +
                '}';
    }
}

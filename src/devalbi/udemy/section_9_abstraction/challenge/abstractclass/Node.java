package devalbi.udemy.section_9_abstraction.challenge.abstractclass;

public abstract class Node {

    private Node previous = null;
    private Node next = null;
    private Object o;

    public Node(Object o) {
        this.o = o;
    }

    public Node getNextItem() {
        if (hasNextItem()) {
            Node node = next;
            return node;
        }

        return null;
    }

    public Node getPreviousItem() {
        if (hasPreviousItem()) {
            Node node = previous;
            return node;
        }

        return null;
    }

    public boolean hasNextItem(){
        if(next == null){
            return false;
        }

        return true;
    }
    public boolean hasPreviousItem(){
        if(previous == null){
            return false;
        }

        return true;
    }

    public int compareTo(Node node) {
        String objectStrValue = String.valueOf(this.o);
        int compareValue = objectStrValue.compareTo(String.valueOf(node));
        return compareValue;
    }

    public Node getPrevious() {
        return previous;
    }

    public Node getNext() {
        return next;
    }

    public Object getO() {
        return o;
    }

    public void setObject(String s){
        this.o = s;
    }

    public void setObject(int s){
        this.o = s;
    }

    public void setObject(double s){
        this.o = s;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

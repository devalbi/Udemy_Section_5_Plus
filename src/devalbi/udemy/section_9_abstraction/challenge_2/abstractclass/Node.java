package devalbi.udemy.section_9_abstraction.challenge_2.abstractclass;

/*
*     2.Node (concrete class)
    -It extends ListItem.
    -It has a constructor that takes an Object, then calls its parent constructor with the parameter that was passed in.
    -And five methods which are package-private:
    -next(), takes no parameters and returns the ListItem to its right.
    -setNext(), takes a ListItem and sets it as its rightLink, then it returns rightLink.
    -previous(), takes no parameters and returns the ListItem to its left.
    -setPrevious(), takes a ListItem and sets it as its leftLink, then it returns leftLink.
    -compareTo(), takes a ListItem and compares it to the ListItem that called this method.
        Use value from ListItem for comparison. If this value is greater than the value that was passed in,
        then it should return a number greater than zero. If vice versa,
        then it should return a number less than zero, and zero if equal.
*
* */


public class Node extends ListItem {
    private SampleObject nodeObject;

    public Node(SampleObject linkObject) {
        super(linkObject);
        nodeObject = this.getValue();
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem newRightLink) {

        if(newRightLink == null) {
            return null;
        }
        this.rightLink = newRightLink;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem newLeftLink) {

        if(newLeftLink == null) {
            return null;
        }
        this.leftLink = newLeftLink;
        return newLeftLink;
    }

    @Override
    int compareTo(ListItem listItem) {
        if(listItem == null) {
            return -1;
        }

        SampleObject comparisonObject = listItem.getValue();
        int compareValue = comparisonObject.getValue().compareTo(nodeObject.getValue());

        return compareValue;
    }

    @Override
    public SampleObject getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(SampleObject value) {
        super.setValue(value);
    }
}

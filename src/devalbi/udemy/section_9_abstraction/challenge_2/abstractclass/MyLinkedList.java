package devalbi.udemy.section_9_abstraction.challenge_2.abstractclass;


/*
* 3.MyLinkedList (concrete class)
    -It implements NodeList.
    -It has one field of type ListItem called root.
    -A constructor that takes a ListItem and initialises
    *   the field root with the newly passed in parameter.
    -And four methods:
    -getRoot(), getter for root.
    -addItem(), takes a ListItem and returns true if it was added successfully or false otherwise.
        If the item is already present, it doesn't get added. Use compareTo() to place the item in its proper order.
    -removeItem(), takes a ListItem and returns true if it was removed successfully or false otherwise.
    -traverse(), takes the root as an argument and does not return anything.
        If the root is null it prints out: The list is empty,
        * otherwise print each value on a separate line.
* */

public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }



    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem listItemToAdd) {
        if(listItemToAdd == null) {
            return false;
        }

        ListItem nextListItem = this.root;
        boolean hasNextLinkItem = true;

        while(hasNextLinkItem) {
            int compareValue = nextListItem.compareTo(listItemToAdd);

            if(compareValue == 0) {
                return false;
            } else if (compareValue > 1) {
                if(nextListItem.next() == null) {
                    nextListItem.setNext(listItemToAdd);
                    return true;
                }
                nextListItem = nextListItem.next();
                break;
            } else if (compareValue < 1) {
                listItemToAdd.setPrevious(nextListItem.previous());
                nextListItem.setPrevious(listItemToAdd);
                return true;
            }

            nextListItem = nextListItem.next();
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem listItemToRemove) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}

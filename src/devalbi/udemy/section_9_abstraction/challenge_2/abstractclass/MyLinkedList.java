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
                System.out.println("List Item " + listItemToAdd.getValue().getValue() + " already in the list");
                return false;
            } else if (compareValue > 0) {

                if(nextListItem.next() == null) {
                    listItemToAdd.setPrevious(nextListItem);
                    nextListItem.setNext(listItemToAdd);

                    System.out.println("Item added: " +listItemToAdd.getValue().getValue() + ", " +
                            ", Left Link: " + listItemToAdd.previous().getValue().getValue());
                    return true;
                }
                nextListItem = nextListItem.next();
                continue;
            } else if (compareValue < 0) {
                if(nextListItem.equals(this.root)) {
                    this.root = listItemToAdd;
                }
                if(nextListItem.previous() != null) {
                    nextListItem.previous().setNext(listItemToAdd);
                    listItemToAdd.setPrevious(nextListItem.previous());

                }
                nextListItem.setPrevious(listItemToAdd);
                listItemToAdd.setNext(nextListItem);

                System.out.println("Item " +listItemToAdd.getValue().getValue() + " added ");
                if(listItemToAdd.previous() != null) {
                    System.out.print(" Left Link: " + listItemToAdd.previous().getValue().getValue());
                }

                if(listItemToAdd.next() != null) {
                    System.out.println("  Right Link: " + listItemToAdd.next().getValue().getValue());
                }
                return true;
            }

            nextListItem = nextListItem.next();
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem listItemToRemove) {
        if ((listItemToRemove == null) || (this.root == null)) {
            return false;
        }


        ListItem currentListItem = this.root;
        boolean hasNextItem = true;

        while (hasNextItem) {

            if (currentListItem.equals(listItemToRemove)) {

                if (listItemToRemove.equals(this.root)) {
                    ListItem itemAfterRoot = this.root.next();


                    System.out.println("Removing Root: " + currentListItem.getValue().getValue() +
                            ", comparing with this.root = " + this.root.getValue().getValue());

                    itemAfterRoot.setPrevious(this.root.previous());
                    this.root = itemAfterRoot;

                    System.out.println("New Root: " + itemAfterRoot.getValue().getValue());
                    return true;

                } else if (currentListItem.next() == null) {

                    ListItem itemBeforeTail = currentListItem.previous();
                    //setting to null
                    itemBeforeTail.setNext(currentListItem.next());

                    System.out.println("Removing Tail: " + currentListItem.getValue().getValue() +
                            ", New tail is = " + itemBeforeTail.getValue().getValue());

                    return true;

                } else {

                    System.out.println("Removing Item: " + currentListItem.getValue().getValue());

                    ListItem previousListItem = currentListItem.leftLink;
                    ListItem nextListItem = currentListItem.rightLink;

                    nextListItem.setPrevious(previousListItem);
                    previousListItem.setNext(nextListItem);

                    return true;
                }
            }
            currentListItem = currentListItem.next();
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if(root == null) {
            System.out.println("The list is empty");
            return;
        }

        ListItem nextListItem = this.root;
        while(nextListItem.next() != null) {
            System.out.println(nextListItem.getValue().getValue());
            nextListItem = nextListItem.next();
        }
    }
}

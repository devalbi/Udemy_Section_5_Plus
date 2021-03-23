package devalbi.udemy.section_9_abstraction.challenge_2.abstractclass;

/*
*
*  5.SearchTree (concrete class)
    -It implements NodeList.
    -It has one field of type ListItem called root.
    -A constructor that takes a ListItem and initialises the
    * field root with the newly passed in parameter.
    -And five methods:
    -getRoot(), getter for root.
    -addItem(), same as MyLinkedList.
    -removeItem(), same as MyLinkedList.
    -performRemoval(), takes two ListItems, the item to be removed and its parent.
        It doesn't return anything and is declared as private.
        * Call this method from removeItem() when the item is found.
    -traverse(), takes the root as an argument and does not return anything.
        It uses recursion to visit all the branches in the tree (Inorder).
        * Print each value on a seperate line.
* */


public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
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
        if ((listItemToRemove == null) || (this.root == null)) {
            return false;
        }


        ListItem currentListItem = this.root;
        boolean hasNextItem = true;

        while (hasNextItem) {

            if (currentListItem.equals(listItemToRemove)) {

                if (listItemToRemove.equals(this.root)) {
                    ListItem itemAfterRoot = this.root.next();

                    itemAfterRoot.setPrevious(this.root.previous());
                    this.root = itemAfterRoot;

                    System.out.println("Item Removed: " + currentListItem.getValue().getValue() +
                            ", new root is" + this.getRoot().getValue().getValue()) ;
                    return true;

                } else if (currentListItem.previous() == null) {

                    ListItem itemBeforeTail = currentListItem.previous();
                    itemBeforeTail.setNext(currentListItem.next());

                    System.out.println("Item Removed: " + currentListItem.getValue().getValue()) ;
                    return true;

                } else {

                    performRemoval(currentListItem,  currentListItem.previous());
                    return true;
                }
            }
        }

        return false;
    }

     private void performRemoval(ListItem itemToRemove, ListItem parentItem) {

        //assumed partent item is to left of itemToRemove
        parentItem.setNext(itemToRemove.next());
        itemToRemove.next().setPrevious(parentItem);
         System.out.println(itemToRemove.getValue().getValue() +" is removed, Parent item is now connected to " +
                  parentItem.next() + " and parent is left of " + parentItem.next().getValue());
    
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
        System.out.println("End of the List");
    }
}

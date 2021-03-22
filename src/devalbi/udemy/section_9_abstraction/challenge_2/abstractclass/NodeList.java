package devalbi.udemy.section_9_abstraction.challenge_2.abstractclass;

/*
* 4.NodeList (interface)
    -It has four methods:
    -getRoot(), addItem(), removeItem() and traverse() which are package-private and abstract (see child class for declaration).

* */


public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem listItemToAdd);
    boolean removeItem(ListItem listItemToRemove);
    void traverse(ListItem root);

}

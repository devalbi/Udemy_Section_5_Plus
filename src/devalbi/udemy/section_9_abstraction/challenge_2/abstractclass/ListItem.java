package devalbi.udemy.section_9_abstraction.challenge_2.abstractclass;


/*
*     1.ListItem (abstract class)
    -It has three protected fields. Two ListItems called rightLink and leftLink,
    * and an Object called value.
    -A constructor that takes an Object and initialises the field value with
    * the parameter that was passed in.
    -And seven methods:
    -next(), setNext(), previous(), setPrevious() and compareTo() which are
    * package-private and abstract (see child class for declaration).
    -getValue(), takes no parameters and returns its value.
    -setValue(), takes an Object and assigns it to value.
* */

public abstract class ListItem {

    protected ListItem rightLink;
    protected ListItem leftLink;
    protected SampleObject value;

    public ListItem(SampleObject linkObject) {
        this.value = linkObject;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem rightLink);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem leftLink);
    abstract int compareTo(ListItem listItem);

    public SampleObject getValue() {
        return value;
    }

    public void setValue(SampleObject value) {
        this.value = value;
    }
}


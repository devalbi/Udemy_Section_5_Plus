package devalbi.udemy.section_9_abstraction.challenge.abstractclass;

public class BinarySearchTree extends ListClass implements IListClass {

    private Node right, left, root =  null;
    boolean runOnce = false;

    public BinarySearchTree() {

    }

    @Override
    public void addItemToList(Node node) {

        if (root == null) {
            root = node;;
            return;
        }

        Node currentNode = root;
        boolean isNodeAdded = false;
        while (!isNodeAdded) {

           int result = currentNode.compareTo(node);
           if (result == 0) {
                System.out.println("Cannot add duplicate for Node: " + currentNode.getObjectValue());
                return;
            } else if (result > 0) {
                if (currentNode.getRight() == null) {
                    currentNode.setRight(node);
                    isNodeAdded = true;
                    System.out.println(node.getObjectValue() + " is added to the right of  " + currentNode);
                } else {
                    currentNode =  currentNode.getRight();
                    continue;
                }
            } else if (result < 0) {
                if(currentNode.getLeft() == null) {
                    currentNode.setLeft(node);
                    System.out.println(node.getObjectValue() + " is added to the Left of  " + currentNode);
                    isNodeAdded = true;
                } else {
                    currentNode =  currentNode.getLeft();
                    continue;
                }
            }
        }
    }

    @Override
    public void removeNode(Node node) {
        Node currentNode = root;

        if(root == null){
            return;
        }

        if(root == node){
             root = minRightValue(root.getRight());
             return;
        }
        boolean isNode = false;
        while (!isNode){
            int result = currentNode.compareTo(node);
            if(result < 0){
                currentNode = currentNode.getLeft();
                continue;
            } else if (result > 0 ){
                currentNode = currentNode.getRight();
                continue;
            } else  if(currentNode == node){ //This is the node to remove.
                //Check to see if both roots are null
                if(currentNode.getRight() == null){
                    currentNode = currentNode.getLeft();
                } else if (currentNode.getLeft() == null){
                    currentNode = currentNode.getRight();
                }
                break;
            }

            currentNode = currentNode.getRight();
            Node tempNode = minRightValue(currentNode);
            currentNode = tempNode;
            if(!isNode) {
                removeNode(tempNode);
                isNode = true;
            }
            isNode = false;

        }
    }

    private Node minRightValue(Node node){
        Node currentNode = root;

        while(currentNode.getLeft() != null){
            currentNode =  currentNode.getLeft();
        }
        return currentNode;
    }

    public Node searchTree(Node node){
        Node currentNode = root;
        boolean isNodeFound = false;

        if(node.getObjectValue() == currentNode.getObjectValue()){
            return root;
        }
        while (!isNodeFound){
            int result = currentNode.compareTo(node);
            if(result == 0 ){
                return currentNode;
            } else  if (result > 0) {
                if((currentNode.getRight() != null)){
                    if(currentNode.getRight() == node){
                        return currentNode.getRight();
                    } else {
                        currentNode = currentNode.getRight();
                        break;
                    }
                } else {
                    System.out.println("Node " + node.getObjectValue() +" does not exist");
                    return null;
                }
            } else  if (result < 0) {
                if((currentNode.getLeft() != null)){
                    if(currentNode.getLeft() == node){
                        return currentNode.getLeft();
                    } else {
                        currentNode = currentNode.getLeft();
                        break;
                    }
                } else {
                    System.out.println("Node " + node.getObjectValue() +" does not exist");
                    return null;
                }
            }

        }
        return null;
    }

    @Override
    public void printList() {
        inOrder(root);
    }

    public void inOrder(Node node){
        if(node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getObjectValue() + " ");
            inOrder(node.getRight());
        }
    }
}

package devalbi.udemy.section_9_abstraction.challenge.abstractclass;

public class BinarySearchTree extends ListClass implements IListClass {

    private Node right, left, root =  null;

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
            } else if (result < 0) {
                if (currentNode.getRight() == null) {
                    currentNode.setRight(node);
                    isNodeAdded = true;
                    System.out.println(node.getObjectValue() + " is added to the right of  " + currentNode);
                } else {
                    currentNode =  currentNode.getRight();
                    continue;
                }
            } else if (result > 0) {
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
        Node parentNode = root;
        boolean isRight = false;
        int counter = 0;

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
            if(result > 0){
                parentNode = currentNode;
                currentNode = currentNode.getLeft();
                isRight = false;
                continue;
            } else if (result < 0 ){
                parentNode = currentNode;
                currentNode = currentNode.getRight();
                isRight = true;
                continue;
            } else  if(currentNode == node){
                performRemoval(currentNode, parentNode, isRight);
                isNode = true;
            }

        }
    }

    public void performRemoval(Node currentNode, Node parentNode, boolean isRight){
        //This is the node to remove.
        //Check to see if both roots are null
        if(currentNode.getRight() == null){
            currentNode = currentNode.getLeft();
            if(isRight){
                parentNode.setRight(currentNode);
            } else {
                parentNode.setLeft(currentNode);
            }
        } else if (currentNode.getLeft() == null){
            currentNode = currentNode.getRight();
            if(isRight){
                parentNode.setRight(currentNode);
            } else {
                parentNode.setLeft(currentNode);
            }
        } else {

            Node minRightValue = currentNode.getRight();
            Node leftMostParent = currentNode;
            Node rightNodeOfMinValue = currentNode;

            while (minRightValue.getLeft() != null) {
                leftMostParent = minRightValue;
                minRightValue = minRightValue.getLeft();
            }

            rightNodeOfMinValue = minRightValue.getRight();
            currentNode.setObjectValue(minRightValue.getObjectValue());

            if(minRightValue.getRight() != null){
                leftMostParent.setLeft(rightNodeOfMinValue);
            }

        }
    }

    private Node minRightValue(Node node){
        Node currentNode = node;

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
            } else  if (result < 0) {
                if((currentNode.getRight() != null)){
                    if(currentNode.getRight() == node){
                        return currentNode.getRight();
                    } else {
                        currentNode = currentNode.getRight();
                        continue;
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
                        continue;
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


    /*This is a recursive method
     * Should look this up*/
    public void inOrder(Node node){
        if(node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getObjectValue() + " ");
            inOrder(node.getRight());
        }
    }
}
class BST {

    class Node {

        private int key;
        private Node parent;
        private Node leftChild;
        private Node rightChild;

        Node () {

            this.key = -1;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;

        } //Node default constructor

        Node (int key) {

            this.key = key;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;

        } //Node constructor with key param

        Node (int key, Node parent, Node leftChild, Node rightChild) {

            this.key = key;
            this.parent = parent;
            this.leftChild = leftChild;
            this.rightChild = rightChild;

        } //Node constructor with key, parent, leftChild, and rightChild params

        public int getKey () {

            return this.key;

        } //getKey

        public void setKey (int key) {

            this.key = key;

        } //setKey

        public Node getParent () {

            return this.parent;

        } //getParent

        public void setParent (Node parent) {

            this.parent = parent;

        } //setParent

        public Node getLeftChild () {

            return this.leftChild;

        } //getLeftChild

        public void setLeftChild (Node leftChild) {

            this.leftChild = leftChild;

        } //setLeftChild

        public Node getRightChild () {

            return this.rightChild;

        } //getRightChild

        public void setRightChild (Node rightChild) {

            this.rightChild = rightChild;

        } //setRightChild

    } //Node

    private Node root;
    private int counter;

    BST () {

        this.root = null;
        this.counter = 0;

    } //Default BST Constructor

    public int size () {

        return this.counter;

    } //size

    public void insert (int element) {

        if (this.counter == 0) {

            Node node = new Node();
            node.setKey(element);
            this.root = node;
            this.counter++;

        } else {

            Node node = new Node();
            node.setKey(element);

            //This chunk (temp + while loop) traverses the bst to get to the end in the place that the node should go
            Node temp = this.root; //Node for traversing
            while (temp.getLeftChild() != null && temp.getRightChild() != null) {

                if (temp.getKey() > element) {

                    temp = temp.getLeftChild();

                } else if (temp.getKey() < element) {

                    temp = temp.getRightChild();

                } else {

                    //if we get here then the value we're inserting is equal to the value of the node

                } //if/else if/else

            } //while

            if (temp.getKey() > element) {

                temp.setLeftChild(node);

            } else if (temp.getKey() < element) {

               temp.setRightChild(node);

            } else {

                //if we get here then the value we're inserting is equal to the value of the node

            } //if/else if/else

        } //if/else

        /**
         * Current problems with this:
         * 
         * 1. If one child node is null and the other isn't I think something bad will happen
         * 2. What do we do if the new value is equal to an existing value
         * 3. Do we need to balance the tree? If so we'll need to add in that logic
         * 
         * */

    } //insert

    public void delete (int element) {

        if (this.counter == 0) {

            return; //Nothing to delete, so the easiest way to leave the method is to simply return.

        } else {

            //TO DO

        } //if/else

    } //delete

    public void preorder () {

        //TO DO

    } //preorder

    public void postorder () {

        //TO DO

    } //postorder

    public void inorder () {

        //TO DO

    } //inorder

    private void preorderHelper (Node current) {

        //TO DO
        //We might can change the return type to something more useful

    } //preorderHelper

    private void postorderHelper (Node current) {

        //TO DO
        //We might can change the return type to something more useful

    } //postorderHelper

    private void inorderHelper (Node current) {

        //TO DO
        //We might can change the return type to something more useful

    } //inorderHelper

} //BST
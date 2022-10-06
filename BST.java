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

        } else {

            

        } //if/else

    } //insert
)
    public void delete (int element) {

        //TO DO

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
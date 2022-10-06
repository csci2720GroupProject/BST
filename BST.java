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

       this.root = insertRecursive(this.root, element);

    } //insert

    public void delete (int element) {

        this.root = deleteRecursive(this.root,element);

    } //delete

    public void preorder () {

        System.out.println("Preorder Traversal"); //title
        preorderHelper(root);
        System.out.println(); //new line

    } //preorder

    public void postorder () {

        System.out.println("Postorder Traversal"); //title
        postorderHelper(root);
        System.out.println(); //new line

    } //postorder

    public void inorder () {

        System.out.println("Inorder Traversal"); //title
        inorderHelper(root);
        System.out.println(); //new line

    } //inorder

    private void preorderHelper (Node current) {

        if (current == null) {

            return; //empty list

        } //if

        System.out.print(current.getKey() + " "); //print value

        if (current.getLeftChild() != null) {

            preorderHelper(current); //traverse left

        } //if

        if (current.getRightChild() != null) {

            preorderHelper(current); //traverse right

        } //if
        
    } //preorderHelper

    private void postorderHelper (Node current) {

        if (current == null) {

            return; //empty list

        } //if

        if (current.getLeftChild() != null) {

            postorderHelper(current); //traverse left

        } //if

        if (current.getRightChild() != null) {

            postorderHelper(current); //traverse right

        } //if

        System.out.print(current.getKey() + " "); //print value

    } //postorderHelper

    private void inorderHelper (Node current) {

        if (current == null) {

            return; //empty list

        } //if

        if (current.getLeftChild() != null) {

            inorderHelper(current); //traverse left

        } //if

        System.out.print(current.getKey() + " "); //print value

        if (current.getRightChild() != null) {

            inorderHelper(current); //traverse right

        } //if

    } //inorderHelper

    private Node insertRecursive (Node current, int element) {

        if (current == null) {

            current  = new Node();
            current.setKey(element);
            this.counter++;

            return current;

        } else if (element < current.getKey()){

            current.setLeftChild(insertRecursive(current, element));
            
        } else if (element > current.getKey()){

            current.setRightChild(insertRecursive(current, element));
            
        } else {

            System.out.println("Element is already in the tree!"); //Found a duplicate value

        } //if/else if/else if/else

        return current;

    } //insertRecursive

    private Node deleteRecursive (Node current, int element) {

        if (current == null) {

            return root;
            
        } //if

        if (element < current.getKey()) {

            current.setLeftChild(deleteRecursive(current, element));

        } else if (element > current.getKey()) {

            current.setRightChild(deleteRecursive(current, element));

        } else {

            //This is where we're deleting
            
            //Node with only one child/no child
            if (current.getLeftChild() == null) {

                return current.getRightChild();

            } else if (current.getRightChild() == null) {

                return current.getLeftChild();

            } //if/else if

            //Node with 2 children
            current.setKey(minValue(current.getRightChild()));

            current.setRightChild(deleteRecursive(current.getRightChild(), current.getKey()));

        } //if/else if/else

        return current;

    } //deleteRecursive

    private int minValue (Node current) {

        int min = current.getKey();

        while (current.getLeftChild() != null) {

            min = current.getLeftChild().getKey();
            current = current.getLeftChild();

        } //while

        return min;

    } //minValue

} //BST
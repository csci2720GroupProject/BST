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

        this.root = deleteRecursive(this.root, element);

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

            System.out.println("The list is empty");
            return; //empty list

        } //if

        System.out.print(current.getKey() + " "); //print value

        if (current.getLeftChild() != null) {

            preorderHelper(current.getLeftChild()); //traverse left

        } //if

        if (current.getRightChild() != null) {

            preorderHelper(current.getRightChild()); //traverse right

        } //if
        
    } //preorderHelper

    private void postorderHelper (Node current) {

        if (current == null) {

            System.out.println("The list is empty");
            return; //empty list

        } //if

        if (current.getLeftChild() != null) {

            postorderHelper(current.getLeftChild()); //traverse left

        } //if

        if (current.getRightChild() != null) {

            postorderHelper(current.getRightChild()); //traverse right

        } //if

        System.out.print(current.getKey() + " "); //print value

    } //postorderHelper

    private void inorderHelper (Node current) {

        if (current == null) {

            System.out.println("The list is empty");
            return; //empty list

        } //if

        if (current.getLeftChild() != null) {

            inorderHelper(current.getLeftChild()); //traverse left

        } //if

        System.out.print(current.getKey() + " "); //print value

        if (current.getRightChild() != null) {

            inorderHelper(current.getRightChild()); //traverse right

        } //if

    } //inorderHelper

    private Node insertRecursive (Node current, int element) {

        if (current == null) {

            current  = new Node();
            current.setKey(element);
            this.counter++;

            return current;

        } else if (element < current.getKey()){

            current.setLeftChild(insertRecursive(current.getLeftChild(), element));
            
        } else if (element > current.getKey()){

            current.setRightChild(insertRecursive(current.getRightChild(), element));
            
        } else {

            System.out.println("Element is already in the tree!"); //Found a duplicate value

        } //if/else if/else if/else

        return current;

    } //insertRecursive

    private Node deleteRecursive (Node current, int element) {

        if (current == null) {

            return current;
            
        } //if

        if (element < current.getKey()) {

            current.setLeftChild(deleteRecursive(current.getLeftChild(), element));

        } else if (element > current.getKey()) {

            current.setRightChild(deleteRecursive(current.getRightChild(), element));

        } else {

            //This is where we're deleting
            
            //Node with only one child/no child
            if (current.getLeftChild() == null) {

                this.counter--;
                return current.getRightChild();

            } else if (current.getRightChild() == null) {

                this.counter--;
                return current.getLeftChild();

            } //if/else if

            //Node with 2 children
            current.setKey(minimum(current.getRightChild()));

            current.setRightChild(deleteRecursive(current.getRightChild(), current.getKey()));

        } //if/else if/else

        return current;

    } //deleteRecursive

    private int minimum (Node current) {

        int min = current.getKey();

        while (current.getLeftChild() != null) {

            min = current.getLeftChild().getKey();
            current = current.getLeftChild();

        } //while

        return min;

    } //minumim

    public void clear() {

        this.root = null;
        this.counter = 0;

    } //clear

    public static void main (String[] args) {

        System.out.println("Our Own Cases Below");
        System.out.println("-------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        BST oldTree = new BST();

        System.out.println("Current size of list: " + oldTree.size());
        oldTree.insert(1);
        System.out.println("Current size of list: " + oldTree.size());

        oldTree.preorder();

        oldTree.delete(1);
        System.out.println("Current size of list: " + oldTree.size());

        oldTree.postorder();

        oldTree.insert(4);
        oldTree.insert(4);
        oldTree.insert(5);
        oldTree.insert(7);
        oldTree.insert(1);
        oldTree.insert(9);
        oldTree.insert(2);
        oldTree.insert(3);
        oldTree.insert(6);
        oldTree.insert(0);
        oldTree.insert(-1);
        System.out.println("Current size of list: " + oldTree.size());


        oldTree.preorder();
        oldTree.inorder();
        oldTree.postorder();

        oldTree.delete(5);
        oldTree.delete(4);
        oldTree.delete(3);
        oldTree.delete(6);
        oldTree.delete(0);
        System.out.println("Current size of list: " + oldTree.size());


        oldTree.preorder();
        oldTree.inorder();
        oldTree.postorder();

        oldTree.clear();
        System.out.println("Current size of list: " + oldTree.size());


        oldTree.preorder();
        oldTree.inorder();
        oldTree.postorder();

        oldTree.delete(0);

        oldTree.preorder();
        oldTree.inorder();
        oldTree.postorder();

        oldTree.insert(3);
        oldTree.insert(4);
        oldTree.insert(1);
        oldTree.insert(399);
        oldTree.insert(8);
        oldTree.insert(0);
        oldTree.insert(999999999);
        oldTree.insert(5);
        oldTree.insert(6);
        oldTree.insert(7);
        oldTree.insert(5);
        oldTree.insert(9);
        oldTree.insert(3);
        oldTree.insert(3);
        oldTree.insert(3456);
        oldTree.insert(2);
        oldTree.insert(3);
        oldTree.insert(5678);
        oldTree.insert(43);
        oldTree.insert(1);
        System.out.println("Current size of list: " + oldTree.size());


        oldTree.preorder();
        oldTree.inorder();
        oldTree.postorder();




        //Provided test cases

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Provided Test Cases Below");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println();
        System.out.println();


        BST tree = new BST();

        tree.insert(4);

        tree.insert(5);

        tree.insert(2);

        tree.insert(9);

        tree.insert(6);

        tree.insert(11);

        tree.insert(10);

        tree.insert(8);

        tree.insert(1);

        tree.insert(14);

        System.out.println("Example 1: preorder traversal");

        System.out.println("Expected:\t" + "4 2 1 5 9 6 8 11 10 14");

        System.out.print("Your Tree:\t");

        tree.preorder();

        System.out.println("\nExample 2: postorder traversal");

        System.out.println("Expected:\t" + "1 2 8 6 10 14 11 9 5 4");

        System.out.print("Your Tree:\t");

        tree.postorder();

        System.out.println("\nExample 3: inorder traversal");

        System.out.println("Expected:\t" + "1 2 4 5 6 8 9 10 11 14");

        System.out.print("Your Tree:\t");

        tree.inorder();

        tree.delete(1);

        System.out.println("\nExample 4: preorder traversal after a deleting a "

                           + "leaf");

        System.out.println("Expected:\t" + "4 2 5 9 6 8 11 10 14");

        System.out.print("Your Tree:\t");

        tree.preorder();

        tree.delete(6);

        System.out.println("\nExample 5: preorder traversal after a deleting a "

                           + "node with one child");

        System.out.println("Expected:\t" + "4 2 5 9 8 11 10 14");

        System.out.print("Your Tree:\t");

        tree.preorder();

        tree.delete(9);

        System.out.println("\nExample 6: preorder traversal after a deleting a "

                           + "node with two children");

        System.out.println("Expected:\t" + "4 2 5 8 11 10 14");

        System.out.print("Your Tree:\t");

        tree.preorder();

        System.out.println("\nExample 7: size of the tree after insertions and "

                           + "deletions");

        System.out.println("Expected:\t" + "7");

        System.out.println("Your Tree:\t" + tree.size());

    } //main

} //BST
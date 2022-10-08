# Project 2: BST

**Group Members:** Jakson Hensley, George Russell, and Gilad Yehudai

## To Compile

---

**javac BST.java**

## To Run

---

**java BST**

## Tests

---

We've implemented a variety of tests inside of the main method to make sure our BST works correctly. To edit, remove, or add tests, simply edit the main method.


## Methods included in Node.java

---

    Node(int key)
Constructs a new Node with a a provided key

    Node(int key, Node parent, Node leftChild, Node rightChild)
Constructs a new Node with a a provided key, parent Node, leftChild Node, and rightChild Node

    public int getKey()
Returns the Node's key as an integer

    public void setKey(int key)
Sets the Node's key equal to the provided parameter

    public Node getParent()
Returns the Node's parent Node

    public void setParent(Node parent)
Sets the Node's parent Node equal to the provided parameter

    public Node getLeftChild()
Returns the Node's left child Node

    public void setLeftChild(Node leftChild)
Sets the Node's left child Node equal to the provided parameter

    public Node getRightChild()
Returns the Node's right child Node

    public void setRightChild(Node rightChild)
Sets the Node's right child Node equal to the provided parameter

## Methods included in BST.java

---

    BST()
Consructs an empty Binary Search Tree

    public int size()
Returns the size of the list as an integer

    public void insert(int element)
Inserts the provided parameter as a node into the list

    public void delete(int element)
Deletes the provided parameter from the list, unless it's not there

    public void preorder()
Prints the contents of the list in pre-order

    public void postorder()
Prints the contents of the list in post-order

    public void inorder()
Prints the contents of the list in in-order

    private void preorderHelper(Node current)
Recursive helper function to print the contents of the list in pre-order

    private void postorderHelper(Node current)
Recursive helper function to print the contents of the list in post-order

    private void inorderHelper(Node current)
Recursive helper function to print the contents of the list in in-order

    private Node insertRecursive (Node current, int element)
Recursive helper function to traverse the BST and find the correct spot to insert the provided element as a new Node

    private Node deleteRecursive (Node current, int element)
Recursive helper function to traverse the BST and find the correct spot to delete the provided element

    private int minimum (Node current)
Helper function for deleteRecursive() that finds the minumum value from a Node and all of its left children

    public void clear()
Clears and resets the BST
package ru.itis;

/**
 * 03.04.2018
 * TreeBstImpl
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class TreeBstImpl<T extends Comparable<T>> implements Tree<T> {
    class Node {
        private T value;
        private Node left;
        private Node right;

        Node(T value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    private Node root;

    public TreeBstImpl() {
        this.root = null;
    }

    public void insert(T value) {
        this.root = insert(root, value);
    }

    public void print() {
        print(root);
    }

    private void print(Node root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.value + " ");
            print(root.right);
        }
    }

    private Node insert(Node root, T value) {
        if (root == null) {
            root = new Node(value);
        } else if (value.compareTo(root.value) <= 0) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    //TODO:
    public boolean remove(T value) {
       return false;
    }

    //TODO:
    public boolean contains(T value) {
        Node root = getRoot();
        Node nodeToFind = new Node(value);
        if(finder(root,nodeToFind).value.equals(value)){
            return true;
        }
            return false;
    }

    public Node finder ( Node current,  Node nodeToCompare){
        if(current.value.compareTo(nodeToCompare.value)==0){
            return current;
        }else if (current.value.compareTo(nodeToCompare.value)>0){
            return finder(current.left, nodeToCompare );
        }else if (current.value.compareTo(nodeToCompare.value)<0){
            return finder(current.right,nodeToCompare);
        }
        return null;
    }

    //TODO:
    @Override
    public void printByLevels() {

    }

    //TODO
    @Override
    public boolean isBst() {
        return false;
    }

    //TODO:
    public boolean equals(Object object) {
        return false;
    }
}
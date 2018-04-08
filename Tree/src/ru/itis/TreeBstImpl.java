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

    public boolean contains(T value) {
        return finderForContains(this.root, value);
    }

    private boolean finderForContains(Node current, T value) {
        if (current != null) {
            if (current.value.equals(value)) {
                return true;
            } else if (current.value.compareTo(value) > 0) {
                return finderForContains(current.left, value);
            } else {
                return finderForContains(current.right, value);
            }
        }
        return false;
    }

    //TODO:
    @Override
    public void printByLevels() {

    }

    
    @Override
    public boolean isBst() {
        return isBst(this.root);
    }

    private boolean isBst(Node current) {
        if (current != null) {
            if ((current.left != null && current.value.compareTo(current.left.value) < 0 ||
                    current.right != null && current.value.compareTo(current.right.value) >= 0)) {
                return false;
            } else {
                isBst(current.left);
                isBst(current.right);
            }
        }
        return true;
    }

    //TODO:
    public boolean equals(Object object) {
        return false;
    }
}
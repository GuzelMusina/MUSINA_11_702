package ru.itis.sources;

/**
 * 02.05.2018
 * Node
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Node<T> {

    private int xCor;
    private int yCor;
    private T value;
    private Node next;

    public int getxCor() {
        return xCor;
    }

    public int getyCor() {
        return yCor;
    }

    public Node(int xCor, int yCor, T value) {
        this.xCor = xCor;
        this.yCor = yCor;
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}



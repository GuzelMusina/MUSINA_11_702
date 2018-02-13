package ru.itis;

/**
 * 13.02.2018
 * LinkedList
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class LinkedList implements List {

    private static class Node {
        Object value;
        Node next;

        public void setNext(Node next) {
            this.next = next;
        }

        Node(Object value) {
            this.value = value;
        }
    }

    // ссылка на первый элемент списка
    private Node head;
    // ссылка на последний элемент списка
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public Object get(int index) {
        Node newNode = null;
        int count = 1;

        if (index == 0) {
            return head;
        } else {
            newNode = head.next;
            while (index != count) {
                newNode = newNode.next;
                count++;
            }
        }
        return newNode.value;
    }

    @Override
    public void addToBegin(Object object) {
        Node newNode = new Node(object);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element);
        tail.next = newNode;
        tail = newNode;
    }

    @Override
    public void remove(Object element) {
        Node current = head;
        while (current.next.value != element) {
            current = current.next;
        }
        current.setNext(current.next.next);

    }

    @Override
    public boolean contains(Object element) {
        for (int i = 0; i < 10; i++) {
            if (element.equals(get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void showAllList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    @Override
    public void reverseList() {

        Node current = head;
        Node previous = null;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;

            head = previous;
        }
    }

}
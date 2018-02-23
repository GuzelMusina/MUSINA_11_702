package ru.itis;

/**
 * 23.02.2018
 * LinkedList
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class LinkedList<T> implements List<T> {
    int count = 0;

    private  class Node {
        T value;
        Node next;

        public void setNext(Node next) {
            this.next = next;
        }

        Node(T value) {
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

    //Метод получения элемента из списка по индексу
    @Override
    public T get(int index) {
        Node newNode = null;
        int count = 1;

        if (index == 0) {
            return head.value;
        } else {
            newNode = head.next;
            while (index != count) {
                newNode = newNode.next;
                count++;
            }
        }
        return newNode.value;
    }

    //Метод добавления элемента в список
    @Override
    public void add(T object) {
        Node newNode = new Node(object);

        if (count == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        count++;
    }

    //Метод удаление элемента из списка
    @Override
    public void remove(T element) {
        Node current = head;
        while (current.next.value != element) {
            current = current.next;
        }
        current.setNext(current.next.next);
    }

    //Метод проверяет существование элемента в списке
    public boolean contains(T element) {
        for (int i = 0; i < 10; i++) {
            if (element.equals(get(i))) {
                return true;
            }
        }
        return false;
    }

    //Метод вывода всего списка на консоль
    @Override
    public void showAllList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}


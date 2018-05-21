package ru.itis.sources;

/**
 * 02.05.2018
 * LinkedList
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class LinkedList<T> implements List<T> {

    int count = 0;
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
    public Node get(int index) {
        Node newNode = null;
        int count = 1;

        if (index == 0) {
            return head;
        } else {
            newNode = head.getNext();
            while (index != count) {
                newNode = newNode.getNext();
                count++;
            }
        }
        return newNode;
    }

    //Метод добавления элемента в список
    @Override
    public void add(int x, int y, T value) {
        Node newNode = new Node(x, y, value);

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
        while (current.getNext().getValue() != element) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
    }

    //Метод проверяет существование элемента в списке
    @Override
    public boolean contains(T element) {
        for (int i = 0; i < 10; i++) {
            if (element.equals(get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    //Метод вывода всего списка на консоль
    @Override
    public void showAllList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }


}
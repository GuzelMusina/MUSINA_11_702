package ru.itis;

/**
 * 13.02.2018
 * LinkedList
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class LinkedList implements List {
    int count = 0;

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

    //Метод получения элемента из списка по индексу
    @Override
    public Object get(int index) {
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
    public void add(Object object) {
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
    public void remove(Object element) {
        Node current = head;
        while (current.next.value != element) {
            current = current.next;
        }
        current.setNext(current.next.next);
    }

    //Метод проверяет существование элемента в списке
    @Override
    public boolean contains(Object element) {
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

    //Метод разворота списка
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

    //Метод слияния двух отсортированных списков в один отсортированный
    public static LinkedList merge(LinkedList sortedA, LinkedList sortedB) {
        LinkedList sortedList = new LinkedList();

        while(sortedA.head!=null && sortedB.head!=null){
            if ((int) sortedA.head.value < (int) sortedB.head.value) {
                sortedList.add(sortedA.head.value);
                sortedA.head = sortedA.head.next;
            } else {
                sortedList.add(sortedB.head.value);
                sortedB.head = sortedB.head.next;
            }
        }
        if(sortedA.head==null){
                sortedList.add(sortedB.head.value);
                sortedB.head = sortedB.head.next;
        }else if(sortedB.head==null){
                sortedList.add(sortedA.head.value);
                sortedA.head = sortedA.head.next;
        }
        return sortedList;
    }

    //Метод сортировки списка
    public static LinkedList sort (LinkedList sortList){
        LinkedList stack [] = new LinkedList[32];
        int count = 0;

        while (sortList.head!=null){
            stack[count] = new LinkedList();
            stack[count].add(sortList.head.value);
            sortList.head = sortList.head.next;
            count++;

            if(count>=2){
                if(stack[count-1].count==stack[count-2].count){
                    stack[count-2] = merge(stack[count-1], stack[count-2]);
                    count--;
                }
            }
        }

        while (count!=1){
            stack[count-2] = merge(stack[count-1], stack[count-2]);
            count--;
        }
        return stack[0];
    }
}
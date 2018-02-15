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

    @Override
    public void addToBegin(Object object) {
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


//    public static LinkedList merge(LinkedList sorted1, LinkedList sorted2) {
//        LinkedList merged = new LinkedList();
//        while (sorted1.head != null && sorted2.head != null) {
//            if ((int) sorted1.head.value < (int) sorted2.head.value) {
//                merged.addToBegin(sorted1.head.value);
//                sorted1.remove(sorted1.head.value);
//            } else {
//                merged.addToBegin(sorted2.head.value);
//                sorted2.remove(sorted2.head.value);
//            }
//        }
//        if (sorted1.head == null) {
//            while (sorted2.head != null) {
//                merged.add(sorted2.head.value);
//                sorted2.remove(sorted2.head.value);
//            }
//        } else if (sorted2.head == null) {
//            while (sorted1.head != null) {
//                merged.add(sorted1.head.value);
//                sorted1.remove(sorted1.head.value);
//            }
//        }
//        return merged;
//    }
    public static LinkedList merge(LinkedList sortedA, LinkedList sortedB) {
        LinkedList sortedList = new LinkedList();

        while(sortedA.head!=null && sortedB.head!=null){
            if ((int) sortedA.head.value < (int) sortedB.head.value) {
                sortedList.addToBegin(sortedA.head.value);
                sortedA.head = sortedA.head.next;
            } else {
                sortedList.addToBegin(sortedB.head.value);
                sortedB.head = sortedB.head.next;
            }
        }
        if(sortedA.head==null){
                sortedList.addToBegin(sortedB.head.value);
                sortedB.head = sortedB.head.next;
        }else if(sortedB.head==null){
                sortedList.addToBegin(sortedA.head.value);
                sortedA.head = sortedA.head.next;
        }
        return sortedList;
    }
}
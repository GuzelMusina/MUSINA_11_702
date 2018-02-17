package ru.itis;

public class Main {


    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.add(5);
        list1.add(3);
        list1.add(9);
        list1.add(2);

        list2.add(7);
        list2.add(1);
        list2.add(2);
        list2.add(6);
        list2.add(4);

        list1 = LinkedList.sort(list1);
        list2 = LinkedList.sort(list2);

        LinkedList list3 = LinkedList.merge(list1,list2);
        list3.showAllList();
    }
}


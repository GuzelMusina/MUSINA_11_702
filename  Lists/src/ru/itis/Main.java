package ru.itis;

public class Main {


    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.addToBegin(1);
        list1.addToBegin(3);
        list1.addToBegin(6);
        list1.addToBegin(9);

        list2.addToBegin(2);
        list2.addToBegin(4);
        list2.addToBegin(7);
        list2.addToBegin(8);
        list2.addToBegin(9);


        LinkedList list3 = LinkedList.merge(list1,list2);
        list3.showAllList();
    }
}


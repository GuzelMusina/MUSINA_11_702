package ru.itis;

public class Main {


    public static void main(String[] args) {
        List list = new LinkedList();
        list.addToBegin(123);
        list.addToBegin(124);
        list.addToBegin(125);
        list.addToBegin(126);
        list.add(505);
        list.add(404);

        //Object x = list.get(2);
        //System.out.println(x);
        //list.contains(124);

        //list.remove(124);
        //list.showAllList();
        list.reverseList();
        list.showAllList();

        //int i = 0;
    }
}


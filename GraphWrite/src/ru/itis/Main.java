package ru.itis;

public class Main {

    public static void main(String[] args) {
        GraphWriter graphInArray = new GraphWriter("input1.txt");
        graphInArray.printArray();
        graphInArray.printGraph();
    }
}

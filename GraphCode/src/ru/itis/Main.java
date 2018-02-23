package ru.itis;

public class Main {

    public static void main(String[] args) {
        GraphCode graphCode = new GraphCode();

        int[][] mi = {
                {1, 0, 0},
                {0, 1, 1},
                {1, 1, 1}
        };

        graphCode.graphToMatrix(mi);
       // graphCode.getMi();
        graphCode.add(0,1);
        graphCode.delete(1,1);
        graphCode.showAllList();
        graphCode.getAdjacent(1);
    }
}

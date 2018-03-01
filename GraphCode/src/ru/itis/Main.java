package ru.itis;

public class Main {

    public static void main(String[] args) {
        GraphCode graphCode = new GraphCode();

        int[][] mi = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 1, 1}
        };

        graphCode.graphToMatrix(mi);
        graphCode.getMi();
        graphCode.add(0, 1);
        graphCode.delete(0, 1);
        graphCode.show(1);
        graphCode.getAdjacent(1);
        graphCode.modify(1);
    }
}

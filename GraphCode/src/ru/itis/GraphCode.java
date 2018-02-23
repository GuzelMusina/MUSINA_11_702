package ru.itis;

import java.util.ArrayList;

/**
 * 22.02.2018
 * Graph Code
 * <p>
 * · void modify(int i): модифицировать список в связи с удалением вершины i из графа,
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class GraphCode<T> extends LinkedList {

    private List<Edge> edges = new LinkedList<Edge>();
    private int count = 0;
    private int leng = 0;

    @Override
    public String toString() {
        return System.getProperty("line.separator") +
                "Edges: " + edges.toString();
    }

    private class Edge {
        public int nodeOne;
        public int nodeTwo;

        public Edge(int nodeOne, int nodeTwo) {
            this.nodeOne = nodeOne;
            this.nodeTwo = nodeTwo;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "nodeOne=" + nodeOne +
                    ", nodeTwo=" + nodeTwo +
                    '}';
        }

        public int getNodeOne() {
            return nodeOne;
        }

        public int getNodeTwo() {
            return nodeTwo;
        }
    }

    public GraphCode() {
    }

    // вставка некоторого ребра (i,j).
    public void add(int nodeOne, int nodeTwo) {
        Edge edge = new Edge(nodeOne, nodeTwo);
        edges.add(edge);
    }

    //построение графа по матрице инцидентности

    public GraphCode graphToMatrix(int[][] mi) {
        leng = mi.length;
        //GraphCode graphCode = new GraphCode();
        for (int i = 0; i < mi.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (mi[i][j] == 1) {
                    this.add(i, j);
                    count++;
                }
            }
        }
        return this;
    }

    // int [][] getMI(): построение матрицы инцидентн
    //TODO
    public int[][] getMi() {
        int[][] mi = new int[leng][leng];
        for (int i = 0; i < leng; i++) {
            for (int j = 0; j < leng; j++) {
                if (edges.get(i) != null && edges.get(j) != null) {
                    mi[i][j] = 1;
                } else {
                    mi[i][j] = 0;
                }
            }
        }
        return mi;
    }

    // удаление ребра (i,j) из списка;

    public void delete(int nodeOne, int nodeTwo) {
        for (int i = 0; i < leng * leng; i++) {
            if (edges.get(i).getNodeOne() == nodeOne && edges.get(i).getNodeTwo() == nodeTwo) {
                edges.remove(edges.get(i));
                break;
            }
        }
    }

    // возврат списка ребер, инцидентных вершине i
    public GraphCode getAdjacent(int n) {
        GraphCode<T> adjacent = new GraphCode<T>();
        for (int i = 0; i < count; i++) {
            if (edges.get(i).nodeOne == n || edges.get(i).nodeTwo == n) {
                adjacent.add(edges.get(i));
            }
        }
        return adjacent;
    }

    //ArrayList<Integer> show(int m): возвратить список вершин, степень инцидентности которых более m.

    //TODO
    public ArrayList<Integer> show(int m){
        ArrayList<Integer> list = new ArrayList<Integer>();
        return list;
    }
}



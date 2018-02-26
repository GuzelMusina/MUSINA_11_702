package ru.itis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 22.02.2018
 * Graph Code
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class GraphCode<T> {

    private List<Edge> edges = new LinkedList<>();
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

    // int [][] getMI(): построение матрицы инцидентнoсти
    //TODO
    public int[][] getMi() {
        int[][] mi = new int[6][6];
        int j = 0;
        for (int i = 0; i < mi.length; i++) {
            Edge edge = new Edge(edges.get(i).getNodeOne(), edges.get(i).getNodeTwo());
            for (j = 0; j < mi.length; j++) {
                if (edges.get(i).equals(edge)) {
                    mi[i][j] = 1;
                    continue;
                } else {
                    mi[i][j] = 0;
                    continue;
                }
            }
            continue;

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
                adjacent.add(edges.get(i).nodeOne, edges.get(i).nodeTwo);
            }
        }
        return adjacent;
    }

    //ArrayList<Integer> show(int m): возвратить список вершин, степень инцидентности которых более m.
    public ArrayList<Integer> show(int m) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        int mi[][] = getMi();
        for (int i = 0; i < mi.length; i++) {
            for (int j = 0; j < mi.length; j++) {
                if (mi[i][j] == 1) {
                    count++;
                }
            }
            if (count >= m) {
                list.add(i);
                System.out.println(i);
            }
            count = 0;
        }
        return list;
    }

 // void modify(int i): модифицировать список в связи с удалением вершины i из графа,
    public void modify (int i){
        for(int n = 0; n<edges.size(); n++){
            if(edges.get(n).nodeOne==i || edges.get(n).nodeTwo==i){
                delete(edges.get(n).nodeOne , edges.get(n).nodeTwo);
            }
        } }
}



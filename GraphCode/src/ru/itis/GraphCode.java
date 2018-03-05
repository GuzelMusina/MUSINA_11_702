package ru.itis;

import java.util.ArrayList;


/**
 * 22.02.2018
 * Graph Code
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class GraphCode<T> {

    private List<Edge> edges = new LinkedList<>();
    private int count = 0;
    private int leng = 0;
    private static int[][] matrix;

    public List<Edge> getEdges() {
        return edges;
    }

    @Override
    public String toString() {
       return edges.toString();
    }

    public static class Edge {
        public int nodeOne;
        public int nodeTwo;

        public Edge(int nodeOne, int nodeTwo) {
            this.nodeOne = nodeOne;
            this.nodeTwo = nodeTwo;
        }

        @Override
        public String toString() {
            return nodeOne + " " + nodeTwo;
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
        for (int i = 0; i < mi.length; i++) {
            for (int j = 0; j <= i; j++ ) {

                if(mi[i][j] ==1){
                    this.add(i, j);
                    count++;
                }
            }
/**
                int temp = 0;
                if (mi[j][i] == 1) {
                    temp = j;
                    j++;
                } else if(mi[i][j]==0) {
                    j++;
                }
                if (mi[i][j] == 1) {
                    this.add(temp, j);
                    i++;
                    j = 0;
                    count++;
                    temp =0;
                }
            }**/
        }
        return this;
    }

    // построение матрицы инцидентнoсти
    public int[][] getMi() {
        matrix = new int[edges.size()][edges.size()];
        for (int i = 0; i < edges.size(); i++) {
            for (int j = 0; j <edges.size(); j++) {
                   if((edges.get(i).nodeOne == j) || (edges.get(i).nodeTwo == j)){
                       matrix[j][i] = 1;
                   }else {
                       matrix[j][i] = 0;
                   }
            }
        }
        return matrix;
    }

    // удаление ребра (i,j) из списка;
    public void delete(int nodeOne, int nodeTwo) {
        for (int i = 0; i < edges.size(); i++) {
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
            }
            count = 0;
        }
        return list;
    }

    // модифицировать список в связи с удалением вершины i из графа,
    public void modify(int i) {
        int consta = 2;
        for (int n = 0; n < consta; n++) {
            if (edges.get(n).nodeOne == i || edges.get(n).nodeTwo == i) {
                delete(edges.get(n).nodeOne, edges.get(n).nodeTwo);
                n=0;
            }
        }
    }
}
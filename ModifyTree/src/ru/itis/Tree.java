package ru.itis;

/**
 * 10.04.2018
 * Tree
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class Tree {

    private int countOfVertex;
    private int countOfNodes;
    private int[] vertex;

    public Tree() {
    }

    public Tree(int countOfVertex, int countOfNodes, int[] vertex) {
        this.countOfVertex = countOfVertex;
        this.countOfNodes = countOfNodes;
        this.vertex = vertex;
    }

    public int modify() {
        int m = 0;
        int count = 1;
        final boolean[] booleans = new boolean[countOfVertex];
        for (int i = 0; i < countOfVertex; i++) {
            while (booleans[i]) i++;
            for (int j = i + 1; j < countOfVertex - 1; j++) {
                if (vertex[i] == vertex[j]) {
                    booleans[j] = true;
                    count++;
                }
            }
            while (count > countOfNodes) {
                    if (count % countOfNodes != 0) {
                        count = count / countOfNodes + 1;
                    } else {
                        count /= countOfNodes;
                    }
                    m += count;
            }
            count = 1;
        }
        return m;
    }
}

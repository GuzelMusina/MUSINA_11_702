package ru.itis;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 21.05.2018
 * GraphWriter
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class GraphWriter {

    private ArrayList<Pair<Integer, Integer>> edges;
    private int countOfVertex;
    private int sizeOfArray;
    private int[] graph;

    public GraphWriter(String fileName) {
        this.edges = new ArrayList<>();
        this.countOfVertex = 0;
        initialization(fileName);
        buildGraph();
    }

    public void initialization(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))) {
            while (reader.ready()) {
                String edge = reader.readLine();
                //substring возвращает подстроку строки
                int vertex = Integer.parseInt(edge.substring(0, edge.indexOf(' ')));
                int to = Integer.parseInt(edge.substring(edge.indexOf(' ') + 1));
                edges.add(new Pair<>(vertex, to));
                countOfVertex = Math.max(countOfVertex, Math.max(vertex, to));
                sizeOfArray++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        graph = new int[++countOfVertex + sizeOfArray];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = -1;
        }
    }

    public void buildGraph() {

        for (Pair<Integer, Integer> edge : edges) {
            graph[edge.getKey()] = (graph[edge.getKey()] == -1) ? 1 : graph[edge.getKey()] + 1;
        }
        int indexVertexEdges = countOfVertex;
        for (int i = 0; i < countOfVertex; i++) {
            if (graph[i] != -1) {
                int countEdges = graph[i];
                graph[i] = indexVertexEdges;
                indexVertexEdges += countEdges;
            }
        }
        for (Pair<Integer, Integer> edge : edges) {
            if (graph[graph[edge.getKey()]] != -1) {
                int emptyPlace = graph[edge.getKey()] + 1;
                for (; graph[emptyPlace] != -1; emptyPlace++) ;
                graph[emptyPlace] = edge.getValue();
            } else {
                graph[graph[edge.getKey()]] = edge.getValue();

            }
        }
    }


    public void printArray() {
        System.out.println(Arrays.toString(graph));
    }

    public void printGraph() {
        for (int i = 0; i < countOfVertex; i++) {
            if (graph[i] != -1) {
                System.out.print("Vertex " + i + ": ");
                int begin = graph[i];
                int end = i + 1;
                for (; graph[end] == -1 && (end < countOfVertex); end++) ;
                end = (end == countOfVertex) ? graph.length : graph[end];
                for (int j = begin; j < end; j++) {
                    System.out.print(graph[j] + " ");
                }
                System.out.println();
            }
        }
    }

    public int[] getGraph() {
        return graph;
    }
}

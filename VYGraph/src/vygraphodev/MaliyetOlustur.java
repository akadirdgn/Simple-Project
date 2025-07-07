package vygraphodev;

import java.util.*;

public class MaliyetOlustur {
    public int vertexCount;
    public Map<Integer, List<Edge>> adjacencyList;

    public MaliyetOlustur(int vertexCount) {
        this.vertexCount = vertexCount;
        this.adjacencyList = new HashMap<>();
        for (int i = 1; i <= vertexCount; i++) {
            adjacencyList.put(i, new LinkedList<>());
        }
    }

    public void addEdge(int baslangicVertex, int sonVertex, int maliyet) {
        Edge edge = new Edge(sonVertex, maliyet);
        adjacencyList.get(baslangicVertex).add(edge);
    }

    public void printGraph() {
        for (Map.Entry<Integer, List<Edge>> entry : adjacencyList.entrySet()) {
            
            for (Edge edge : entry.getValue()) {
                System.out.print(entry.getKey() + " -> ");
                System.out.print(" " + edge.getSonVertex() + " maliyet: " + edge.getMaliyet() + "      ");
            }
            System.out.println();
        }
    }

    static class Edge {
        private int sonVertex;
        private int maliyet;

        public Edge(int sonVertex, int maliyet) {
            this.sonVertex = sonVertex;
            this.maliyet = maliyet;
        }

        public int getSonVertex() {
            return sonVertex;
        }

        public int getMaliyet() {
            return maliyet;
        }
    }
}

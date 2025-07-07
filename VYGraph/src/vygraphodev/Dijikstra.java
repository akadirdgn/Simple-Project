package vygraphodev;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Dijikstra {
    private MaliyetOlustur graph;

    public Dijikstra(MaliyetOlustur graph) {
        this.graph = graph;
    }
    
    static class Node {
        private int vertex;
        private int mesafe;

        public Node(int vertex, int mesafe) {
            this.vertex = vertex;
            this.mesafe = mesafe;
        }
    }


    public Map<Integer, Integer> findShortestPath(int baslangicVertex, int sonVertex) {
        Map<Integer, Integer> mesafeMap = new HashMap<>();
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.mesafe));

        for (int vertex : graph.adjacencyList.keySet()) {
            mesafeMap.put(vertex, Integer.MAX_VALUE);
        }

        mesafeMap.put(baslangicVertex, 0);
        minHeap.offer(new Node(baslangicVertex, 0));

        while (!minHeap.isEmpty()) {
            Node currentNode = minHeap.poll();
            int currentVertex = currentNode.vertex;

            for (MaliyetOlustur.Edge neighbor : graph.adjacencyList.get(currentVertex)) {
                int newDistance = mesafeMap.get(currentVertex) + neighbor.getMaliyet();
                if (newDistance < mesafeMap.get(neighbor.getSonVertex())) {
                    mesafeMap.put(neighbor.getSonVertex(), newDistance);
                    minHeap.offer(new Node(neighbor.getSonVertex(), newDistance));
                }
            }
        }

        return mesafeMap;
    }
}

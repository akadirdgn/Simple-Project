package vygraphodev;

import java.util.Map;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        int x;
        
        Random random = new Random();
        
        
        MaliyetOlustur graph = new MaliyetOlustur(5);
        
        x = random.nextInt(10) + 1;
        graph.addEdge(1, 2, x);
        graph.addEdge(2, 1, x);
        
        x = random.nextInt(10) + 1;
        graph.addEdge(1, 3, x);
        graph.addEdge(3, 1, x);
        
        x = random.nextInt(10) + 1;
        graph.addEdge(1, 4, x);
        graph.addEdge(4, 1, x);
        
        
        x = random.nextInt(10) + 1;
        graph.addEdge(2, 3, x);
        graph.addEdge(3, 2, x);
        
        x = random.nextInt(10) + 1;
        graph.addEdge(2, 5, x);
        graph.addEdge(5, 2, x);

        
        x = random.nextInt(10) + 1;
        graph.addEdge(3, 4, x);
        graph.addEdge(4, 3, x);
        
        x = random.nextInt(10) + 1;
        graph.addEdge(3, 5, x);
        graph.addEdge(5, 3, x);
        
        x = random.nextInt(10) + 1;
        graph.addEdge(4, 5, x);
        graph.addEdge(5, 4, x);
        

        graph.printGraph();

        Dijikstra dijkstra = new Dijikstra(graph);
        
        
        System.out.println("***************-----------------***************");
        int baslangicVertex = random.nextInt(graph.vertexCount) + 1;
        int sonVertex = random.nextInt(graph.vertexCount) + 1;

        Map<Integer, Integer> shortestDistances = dijkstra.findShortestPath(baslangicVertex, sonVertex);

        System.out.println("Baslangic dugumu: " + baslangicVertex);
        System.out.println("Bitis dugumu: " + sonVertex);
        System.out.println("En kisa maliyet yolu: " + shortestDistances.get(sonVertex));
    }
}


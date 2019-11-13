import models.Graph;
import models.Vertex;
import managers.Dijkstra;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import static managers.Dijkstra.dijkstra;

public class Main {
     public static void main(String[] args) {
        int edge_number = 8;
        int start_vertex = 5;
         Graph graph = new Graph();
         graph.addVertex(0,3,8);
         graph.addVertex(1,4,9);
         graph.addVertex(4,2,4);
         graph.addVertex(5,0,9);
         graph.addVertex(5,4,6);
         graph.addVertex(5,1,7);
         graph.addVertex(1,2,1);
         graph.addVertex(3,1,0);
         graph.getVertices().add(new Vertex(2));

         for (int i = 0; i < graph.getVertices().size(); i++){
             System.out.println(graph.getVertices().get(i).getLabel());
         }
        graph.showGraph();
         System.out.println( dijkstra(graph, new Vertex(0,3,8)));
    }
}

package managers;

import models.Graph;
import models.Vertex;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {

    public static List<Integer> dijkstra(Graph graph, Vertex start_vertex){

        final int infinity = 100;
        List<Integer> distances = new ArrayList<>();
        Vertex shortest_distance_vertex;
        int shortest_distance_index;
        int neighbor_label;
        int alt_distance;

        for (int i = 0;i < graph.getVertices().size(); i++){
            distances.add(infinity);
        }
        distances.set(start_vertex.getLabel(),0);
        System.out.println(distances);


        List<Vertex> visit_list = new ArrayList<>();

        for (int i = 0; i < graph.getVertices().size(); i++){
            visit_list.add(graph.getVertices().get(i));
        }

        while (visit_list.size() > 0){

            shortest_distance_vertex = visit_list.get(0);
            shortest_distance_index = 0;

            for (int i = 0; i < visit_list.size(); i++){

                if(distances.get(visit_list.get(i).getLabel()) < distances.get(shortest_distance_index)){

                    shortest_distance_vertex = visit_list.get(i);
                    shortest_distance_index = i;
                }
            }
            visit_list.remove(shortest_distance_index);

            for (int i = 0; i < shortest_distance_vertex.getOutbound_endges().size(); i++){
                neighbor_label = shortest_distance_vertex.getOutbound_endges().get(i).getEnd_vertex().getLabel();
                alt_distance = distances.get(shortest_distance_vertex.getLabel()) + shortest_distance_vertex.getOutbound_endges().get(i).getWeight();

                if(alt_distance < distances.get(neighbor_label)){
                    distances.set(neighbor_label,alt_distance);
                }
            }


        }

        return distances;
    }

}

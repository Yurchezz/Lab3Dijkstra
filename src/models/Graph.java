package models;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Graph {
    List<Vertex> vertices = new ArrayList<>();

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    public List<Integer> getLabels(){
        List<Integer> labels = new ArrayList<>();
        for(int i = 0; i < vertices.size(); i++){
            labels.add(vertices.get(i).getLabel());
        }
        return labels;
    }
    public Vertex getVertex(int label){
        for (int i = 0; i < vertices.size(); i++){
           if(label == vertices.get(i).getLabel()){
              return vertices.get(i);
           }
       }
        return null;
    }
    public void addVertex(int label, int next_vertex_label, int edge_weight) {

        if(this.getLabels().contains(label)){
            this.getVertex(label).addEdge(next_vertex_label,edge_weight);
        }else {
            vertices.add(new Vertex(label, next_vertex_label, edge_weight));
        }
    }
    public void showGraph(){

        for (int i = 0; i < vertices.size(); i++){
            System.out.println(
                    vertices.get(i).getLabel()
                            + " -> "
                    + vertices.get(i).getOutbound_endges()
            );
        }

    }

}

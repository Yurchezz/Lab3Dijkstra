package models;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int label;

    public List<Edge> getOutbound_endges() {
        return outbound_endges;
    }

    public void setOutbound_endges(List<Edge> outbound_endges) {
        this.outbound_endges = outbound_endges;
    }

    private List<Edge> outbound_endges = new ArrayList<>();

    public Vertex(int label, Edge new_outbound_edge) {
        this.label = label;
        this.outbound_endges.add(new_outbound_edge);
    }
    public Vertex(int label) {
        this.label = label;

    }
    public Vertex(int label, int next_vertex_label, int edge_weight) {
        this.label = label;
        outbound_endges.add(new Edge(next_vertex_label, edge_weight));
    }


    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }
    public void addEdge(int next_label, int weight){
        outbound_endges.add(new Edge(next_label,weight));
    }
}

package models;

public class Edge {
    private int weight;
    private Vertex end_vertex;

    public Edge( int end_vertex, int weight) {
        this.weight = weight;
        this.end_vertex = new Vertex(end_vertex);
    }

    public Vertex getEnd_vertex() {
        return end_vertex;
    }

    public void setEnd_vertex(Vertex end_vertex) {
        this.end_vertex = end_vertex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" +
                "---" + weight +
                "--->" + end_vertex.getLabel() + ")";
    }
}

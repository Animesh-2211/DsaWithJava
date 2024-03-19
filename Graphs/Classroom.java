package Graphs;

import java.util.*;

public class Classroom {
    static class Edge {

        int src;
        int des;

        public Edge(int s, int d) {// constructor
            this.src = s;
            this.des = d;

        }
    }

    public static void create(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();// now graph array does not has null values but it has arraylist in eachindex so we can store values in it
       
            graph[0].add(new Edge(0, 2));
            graph[1].add(new Edge(1, 2));
            graph[1].add(new Edge(1, 3));
            graph[2].add(new Edge(2, 0));
            graph[2].add(new Edge(2, 3));
            graph[2].add(new Edge(2, 1));
            graph[3].add(new Edge(3, 2));
            graph[3].add(new Edge(3, 1));
            

       
        }

    }

    public static void main(String[] args) {
        int V = 4;// vertices

        ArrayList<Edge> graph[] = new ArrayList[V]; // graph array has arrayist stored in each index and arratindex has
                                                    // edge stored
    }

}

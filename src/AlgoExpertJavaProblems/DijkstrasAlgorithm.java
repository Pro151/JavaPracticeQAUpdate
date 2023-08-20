package AlgoExpertJavaProblems;

import java.util.*;

public class DijkstrasAlgorithm {
    static class Graph {
        private int V;
        private List<List<Node>> adj;

        Graph(int V) {
            this.V = V;
            adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v, int weight) {
            adj.get(u).add(new Node(v, weight));
            adj.get(v).add(new Node(u, weight));
        }

        void dijkstra(int source) {
            PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
            minHeap.offer(new Node(source, 0));

            int[] distance = new int[V];
            Arrays.fill(distance, Integer.MAX_VALUE);
            distance[source] = 0;

            while (!minHeap.isEmpty()) {
                Node current = minHeap.poll();

                for (Node neighbor : adj.get(current.vertex)) {
                    int newDist = distance[current.vertex] + neighbor.weight;
                    if (newDist < distance[neighbor.vertex]) {
                        distance[neighbor.vertex] = newDist;
                        minHeap.offer(new Node(neighbor.vertex, newDist));
                    }
                }
            }

            for (int i = 0; i < V; i++) {
                System.out.println("Shortest distance from source to vertex " + i + ": " + distance[i]);
            }
        }

        static class Node {
            int vertex;
            int weight;

            Node(int vertex, int weight) {
                this.vertex = vertex;
                this.weight = weight;
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        Graph graph = new Graph(V);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 7);
        graph.addEdge(2, 3, 3);
        graph.addEdge(3, 4, 2);

        int source = 0;
        graph.dijkstra(source);
    }
}

/*  3. Dijkstra's Shortest Path Algorithm:

Dijkstra's algorithm finds the shortest path from a starting vertex to all other
vertices in a weighted graph.*/
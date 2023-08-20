package AlgoExpertJavaProblems;

import java.util.*;

public class TopologicalSort {
    public static List<Integer> topologicalSort(List<Integer>[] graph) {
        int n = graph.length;
        List<Integer> result = new ArrayList<>();
        int[] inDegrees = new int[n];

        for (List<Integer> edges : graph) {
            for (int v : edges) {
                inDegrees[v]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (inDegrees[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int u = queue.poll();
            result.add(u);
            for (int v : graph[u]) {
                if (--inDegrees[v] == 0) {
                    queue.offer(v);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[2].add(3);
        graph[3].add(4);
        graph[4].add(5);
        List<Integer> result = topologicalSort(graph);
        System.out.println("Topological Sort Order: " + result);
    }
}
/* Problem: Topological Sort (Directed Acyclic Graph):

Description: Given a directed acyclic graph, find a linear ordering of vertices such that
for every directed edge (u, v), vertex u comes before v in the ordering.
Code Example (Java):

Explanation: This code demonstrates the topological sort algorithm for a directed acyclic graph (DAG).
The algorithm calculates in-degrees for each vertex,
iteratively removes nodes with in-degree 0, and updates in-degrees of adjacent vertices.
*/
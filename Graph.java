import java.util.*;
//-----------------------------------------------------
// Title: Graph Class
// Author: Sarp Arslan
// ID: 11458145526
// Section: 3
// Assignment: 1
// Description: This class creates a graph
//-----------------------------------------------------
public class Graph {
    public Map<Integer, List<Integer>> adjacencyList;
    public int size = 0;
    public Graph() {
        adjacencyList = new HashMap<>();
    }
    
    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
        size++;
    }
    
    public void addEdge(int vertex1, int vertex2) {
        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);
    }
    
    public void removeVertex(int vertex) {
        adjacencyList.remove(vertex);
        for (List<Integer> adjList : adjacencyList.values()) {
            adjList.remove(Integer.valueOf(vertex));
        }
    }
    
    public void removeEdge(int vertex1, int vertex2) {
        adjacencyList.get(vertex1).remove(Integer.valueOf(vertex2));
        adjacencyList.get(vertex2).remove(Integer.valueOf(vertex1));
    }
    
    public List<Integer> getAdjacentVertices(int vertex) {
        return adjacencyList.get(vertex);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int vertex : adjacencyList.keySet()) {
            sb.append(vertex).append(": ");
            for (int neighbor : adjacencyList.get(vertex)) {
                sb.append(neighbor).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public boolean contains(int vertex) {
        return adjacencyList.containsKey(vertex);
    }
    public List<List<Integer>> findAllPaths(int source, int destination) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(source);
        boolean[] visited = new boolean[size + 1];
        visited[source] = true;
        dfs(source, destination, visited, path, allPaths);
        return allPaths;
    }
    
    private void dfs(int current, int destination, boolean[] visited, List<Integer> path, List<List<Integer>> allPaths) {
        if (current == destination) {
            allPaths.add(new ArrayList<>(path));
            return;
        }
        
        for (int neighbor : getAdjacentVertices(current)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                path.add(neighbor);
                dfs(neighbor, destination, visited, path, allPaths);
                visited[neighbor] = false;
                path.remove(path.size() - 1);
            }
        }
    }

}

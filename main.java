import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//-----------------------------------------------------
// Title: Main Class
// Author: Sarp Arslan
// ID: 11458145526
// Section: 3
// Assignment: 1
// Description: This class tests the program
//-----------------------------------------------------
public class main {

    public static void main(String[] args) {
        //--------------------------------------------------------
    	// Summary: Tests the program, initialize values creates graph
    	// and creates a total list to print.
    	// Precondition: There must be a main class
    	// Postcondition: The program works and prints the result.
    	//--------------------------------------------------------
    	

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values");

        // Read the first line of input
        String[] firstLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);  // 5 => vertex sayısı
        int m = Integer.parseInt(firstLine[1]);  // 5 => edge sayısı

        Graph graph = new Graph();

        // Read the input for the edges and add them to the graph
        for (int i = 0; i < m; i++) {
            String[] otherLines = scanner.nextLine().split(" ");
            int u = Integer.parseInt(otherLines[0]);
            int v = Integer.parseInt(otherLines[1]);

            // If the vertex is not already in the graph, add it
            if (!graph.contains(u)) {
                graph.addVertex(u);
            }
            if (!graph.contains(v)) {
                graph.addVertex(v);
            }

            graph.addEdge(u, v);
        }

        // Read the input for x and y
        String[] lastLine = scanner.nextLine().split(" ");
        int x = Integer.parseInt(lastLine[0]);
        int y = Integer.parseInt(lastLine[1]);

        scanner.close();

        // Find all paths from x to y in the graph
        List<List<Integer>> allPaths = graph.findAllPaths(x, y);

        int smallestSize = Integer.MAX_VALUE;
        int secondSmallestSize = Integer.MAX_VALUE;

        List<Integer> smallestPath = null;
        List<Integer> secondSmallestPath = null;

        // Find the smallest and second smallest paths
        for (List<Integer> path : allPaths) {
            int size = path.size();

            if (size < smallestSize) {
                secondSmallestSize = smallestSize;
                secondSmallestPath = smallestPath;
                smallestSize = size;
                smallestPath = path;
            } else if (size < secondSmallestSize && !path.containsAll(smallestPath)) {
                secondSmallestSize = size;
                secondSmallestPath = path;
            }
        }

        // Combine the smallest and second smallest paths into a new list
        List<Integer> combinedList = new ArrayList<>();

        // Add all elements from the smallestPath list
        for (Integer element : smallestPath) {
            if (!combinedList.contains(element)) {
                combinedList.add(element);
            }
        }

        // Add all elements from the secondSmallestPath list, avoiding duplicates
        for (Integer element : secondSmallestPath) {
            if (!combinedList.contains(element)) {
                combinedList.add(element);
            }
        }

        // Sort the combined list and print it with space as a separator
        combinedList.sort(null);
        for (Integer element : combinedList) {
            System.out.print(element + " ");
        }
    }
}

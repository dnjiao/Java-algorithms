package graph;
/**
 * Given a graph and a source vertex in graph, find shortest paths from source to all vertices in the given graph.
 * 
 * 
 * SOLUTION:
 * 1) Create a set sptSet (shortest path tree set) that keeps track of vertices included in shortest path tree, i.e., 
 * whose minimum distance from source is calculated and finalized. Initially, this set is empty.
2) Assign a distance value to all vertices in the input graph. Initialize all distance values as INFINITE. 
Assign distance value as 0 for the source vertex so that it is picked first.
3) While sptSet doesn¡¯t include all vertices
¡­.a) Pick a vertex u which is not there in sptSetand has minimum distance value.
¡­.b) Include u to sptSet.
¡­.c) Update distance value of all adjacent vertices of u.
 * @author Oscar
 *
 */
public class Dijkstra {
	
	static int V = 9;

	int[] dijkstra(int[][] graph, int src) {
		
		// array for visited vertices
		boolean visited[] = new boolean[V];
		
		// array of distance from source to vertices
		int[] dist = new int[V];	
		for (int i = 0; i < V; i++) {
			if (src == i) dist[i] = 0;
			else dist[i] = Integer.MAX_VALUE;
		}
		
		for (int i = 0; i < V; i++) {
			int u = minDistance(dist, visited);
			visited[u] = true;
			
			for (int j = 0; j < V; j++) {
				if (visited[j] == false && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][j] < dist[j]) {
					dist[j] = dist[u] + graph[u][j];
				}
			}
		}
		
		return dist;
	}
	
	int minDistance(int[] dist, boolean[] visited) {
		int min = Integer.MAX_VALUE;
		
		int index = -1;
		
		for (int i = 0; i < V; i++) {
			if (visited[i]) {
				if (dist[i] < min) {
					min = dist[i];
					index = i;
				}
			}
		}
		
		return index;
	}

}

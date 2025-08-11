package DS_ALGO.Graph;

import java.util.ArrayList;

class Cycle {
    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];

        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                if (dfs(adj, visited, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int current, int parent) {
        visited[current] = true;

        for (Integer neighbor : adj.get(current)) {
            if (!visited[neighbor]) {
                // If cycle found in subtree, return true
                if (dfs(adj, visited, neighbor, current)) {
                    return true;
                }
            } else if (neighbor != parent) {
                // If neighbor is visited and not parent, cycle exists
                return true;
            }
        }
        return false;
    }
}
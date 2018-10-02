package Data;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Graph {

    public final static int INF = 99999;

    public static int[][] getDistanceMatrix(ArrayList<Node> nodes, ArrayList<Edge> edges) {
        int matrix[][] = new int[nodes.size()][nodes.size()];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = INF;
                }
            }
        }
        edges.forEach((edge) -> {
            matrix[nodes.indexOf(edge.getNodeOrigin())][nodes.indexOf(edge.getNodeDestiny())] = edge.getDistance();
        });
        return matrix;
    }

    public static void floyd(int[][] adj) {
        for (int k = 0; k < adj.length; k++) {
            for (int i = 0; i < adj.length; i++) {
                for (int j = 0; j < adj.length; j++) {
                    if (adj[i][k] + adj[k][j] < adj[i][j]) {
                        adj[i][j] = adj[i][k] + adj[k][j];
                    }
                }
            }
        }
    }

}

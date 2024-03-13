import java.util.ArrayList;
import java.util.Collections;

public class gfg_matrix_diagonal_pattern {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length;
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] al = new ArrayList[n + n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int idx = i + j;
                if (al[idx] == null)
                    al[idx] = new ArrayList<>();
                al[idx].add(mat[i][j]);
            }
        }

        int res[] = new int[n * n];
        int idx = 0;

        for (int i = 0; i < al.length; i++) {
            if ((i & 1) == 1) {
                for (int x : al[i]) {
                    res[idx++] = x;
                }
            } else {
                Collections.reverse(al[i]);
                for (int x : al[i]) {
                    res[idx++] = x;
                }
            }

        }

        return res;
    }

    public static void main(String[] args) {
        // Example 2D matrix
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Create an instance of the gfg_matrix_diagonal_pattern class
        gfg_matrix_diagonal_pattern obj = new gfg_matrix_diagonal_pattern();

        // Call the matrixDiagonally method and get the result
        int[] result = obj.matrixDiagonally(matrix);

        // Print the result
        System.out.println("Resulting array:");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}

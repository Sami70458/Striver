package Arrays.Medium;

import java.util.*;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1 ,1},
                { 1, 0, 1 ,1},
                { 1, 1, 1,1 }
        };

        setZero(matrix);

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }

    static void matrixZero(int[][] matrix){
        
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int col = 0; col < matrix[0].length; col++) {
                        if (matrix[i][col] != 0) {
                            matrix[i][col] = -1;
                        }
                    }
                    for (int row = 0; row < matrix.length; row++) {
                        if (matrix[row][j] != 0) {
                            matrix[row][j] = -1;
                        }
                    }
                }
            }

            

        }

        for (int k = 0; k < matrix.length; k++) {
                for (int l = 0; l < matrix[0].length; l++) {
                    if (matrix[k][l] == -1)
                        matrix[k][l] = 0;
                }
            }
    }

    static void setZero(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i = 0; i<m; i++){
            for(int j= 0; j<n; j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i = 0; i<m; i++){
            for(int j= 0; j<n; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

/*

Time and Space Complexity
1️⃣ matrixZero() (Brute Force Approach using -1 markers)

Time Complexity: O((m × n) × (m + n))

For each 0 found, you scan its entire row and column → O(m + n) per zero.

In the worst case, if all elements are 0, this becomes O((m × n) × (m + n)).

Space Complexity: O(1) auxiliary space (in-place, only uses -1 as marker).

2️⃣ setZero() (Optimal Approach using boolean arrays)

Time Complexity: O(m × n)

First pass: mark rows and columns → O(m × n)

Second pass: set zeros → O(m × n)

Space Complexity: O(m + n)

Boolean arrays for rows and columns.

✅ Key Idea:

matrixZero() is simpler but can be very slow for large matrices.

setZero() is much more efficient in time, at the cost of extra O(m + n) space.

If needed, there’s also a truly O(1) space solution using the first row and column as markers.

*/


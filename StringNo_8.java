
💡 **Question 8**

Given two [sparse matrices](https://en.wikipedia.org/wiki/Sparse_matrix) mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2. You may assume that multiplication is always possible.

**Input:** mat1 = [[1,0,0],[-1,0,3]], mat2 = [[7,0,0],[0,0,0],[0,0,1]]

**Output:**

[[7,0,0],[-7,0,3]]
soln : // Time Complexity:O(m * k * n);
       //space complexity :O(m * n)

public class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;    // Number of rows in mat1
        int k = mat1[0].length; // Number of columns in mat1
        int n = mat2[0].length; // Number of columns in mat2

        int[][] result = new int[m][n];

        // Iterate over each element in mat1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                if (mat1[i][j] != 0) {
                    // Multiply the non-zero element with corresponding elements in mat2
                    for (int l = 0; l < n; l++) {
                        result[i][l] += mat1[i][j] * mat2[j][l];
                    }
                }
            }
        }

        return result;
    }
}
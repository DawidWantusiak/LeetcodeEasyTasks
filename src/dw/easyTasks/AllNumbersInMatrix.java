package dw.easyTasks;

import java.util.HashSet;
import java.util.Set;

/*
Task 2133 (easy)
An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
Given an n x n integer matrix, return true if the matrix is valid. Otherwise, return false.

Example 1:
Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
Output: true
Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
Hence, we return true.

Example 2:
Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
Output: false
Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
Hence, we return false.

Constraints:
n == matrix.length == matrix[i].length
1 <= n <= 100
1 <= matrix[i][j] <= n
*/
public class AllNumbersInMatrix {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> set = new HashSet<>();
        for (int[] row : matrix) {
            for (int i = 0; i < matrix.length; i++) {
                if (set.contains(row[i]) || row[i] > matrix.length) {
                    return false;
                }
                set.add(row[i]);
            }
            set.clear();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int[] column : matrix) {
                if (set.contains(column[i]) || column[i] > matrix.length) {
                    return false;
                }
                set.add(column[i]);
            }
            set.clear();
        }
        return true;
    }
}


















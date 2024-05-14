// Problem Link: https://leetcode.com/problems/find-a-peak-element-ii/description/

class Solution {
    public int[] findPeakGrid(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int low = 0, high = m-1;
        while(low <= high) {
            int midCol = (low + high) / 2;
            int colMaxElementRow = maxElement(matrix, n, m, midCol);
            int left = midCol-1 >= 0? matrix[colMaxElementRow][midCol-1] : -1;
            int right = midCol+1 < m? matrix[colMaxElementRow][midCol+1] : -1;
            if(left < matrix[colMaxElementRow][midCol] && matrix[colMaxElementRow][midCol] > right) 
                return new int[]{colMaxElementRow, midCol};
            else if(left > matrix[colMaxElementRow][midCol]) high = midCol-1;
            else low = midCol+1;
        }
        return new int[]{-1, -1};
    }
    public static int maxElement(int[][] matrix, int n, int m, int mid) {
        int maxElement = -1, rowIndex = -1;
        for(int i=0; i<n; i++) {
            if(matrix[i][mid] > maxElement) {
                maxElement = matrix[i][mid];
                rowIndex = i;
            }
        }
        return rowIndex;
    }
}

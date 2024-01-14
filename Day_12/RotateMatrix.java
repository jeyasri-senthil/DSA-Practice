// Problem Link: https://leetcode.com/problems/rotate-image/description/
// Problem Link: https://www.codingninjas.com/studio/problems/rotate-the-matrix_6825090

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++){
            reverse(matrix[i], 0, n-1);
        }
    }
    public static void reverse(int[] row, int start, int end){
        while(start < end){
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }
}

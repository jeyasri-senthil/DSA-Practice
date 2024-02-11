// Problem Link: https://www.interviewbit.com/problems/diagonal-flip/

public class Solution {
    public int[][] solve(int[][] A) {
        int n = A.length, m = A[0].length;
        int[][] transpose = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                transpose[i][j] = A[j][i];
            }
        }
    return transpose;
    }
}

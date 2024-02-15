// Problem Link: https://www.interviewbit.com/problems/set-matrix-zeros/

public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int n = a.size(), m = a.get(0).size(); 
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(a.get(i).get(j) == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(row[i] == 1 || col[j] == 1) a.get(i).set(j, 0);
            }
        }
	}
}

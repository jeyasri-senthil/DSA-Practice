// Problem Link: https://www.interviewbit.com/problems/maximum-sum-square-submatrix/

public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int n = A.size(), m = A.get(0).size();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=n-B; i++) {
            for(int j=0; j<=m-B; j++) {
                int sum = 0;
                for(int s=i; s<i+B; s++) {
	                for(int k=j; k<j+B; k++) {
	                    sum += A.get(s).get(k);
                    }
                }
	            if(max < sum) max = sum;
            }
        }
        return max;
    }
}

// Problem Link: https://www.interviewbit.com/problems/greater-of-lesser/

public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int n = A.size(), m = B.size();
        int greaterCount = 0, smallerCount = 0;
        for(int i=0; i<n; i++) {
            if(A.get(i) > C) greaterCount++;
        }
        for(int i=0; i<m; i++) {
            if(B.get(i) < C) smallerCount++;
        }
        int max = Math.max(greaterCount, smallerCount);
        return max;
    }
}

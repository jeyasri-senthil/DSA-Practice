// Problem Link: https://www.interviewbit.com/problems/amazing-subarrays/

public class Solution {
    public int solve(String str) {
        char[] A = str.toCharArray();
        int n = A.length, count = 0;
        for(int i=0; i<n; i++) {
            if(A[i] == 'A' || A[i] == 'E' || A[i] == 'I' || A[i] == 'O' || A[i] == 'U' || A[i] == 'a' || A[i] == 'e' || A[i] == 'i' || A[i] == 'o' || A[i] == 'u') {
                count = count + (n-i);
            }
        }  
        return count % 10003; 
    }
}

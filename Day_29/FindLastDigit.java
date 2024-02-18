// Problem Link: https://www.interviewbit.com/problems/find-last-digit/

public class Solution {
    public int solve(String A, String B) {
        int a = A.charAt(A.length() - 1) - '0';
        int b = Integer.parseInt(B.substring(B.length() - 2));
        int ans = (int) Math.pow(a, b % 4 + 4);
        return (int) ans%10;
    }
}

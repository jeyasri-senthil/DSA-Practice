// Problem Link: https://www.interviewbit.com/problems/greatest-common-divisor/

public class Solution {
    public int gcd(int A, int B) {
        return gcdCal(A, B);
    }
    public static int gcdCal(int a, int b) {
        if(b == 0) return a;
        else return gcdCal(b, Math.abs(a-b));
    }
}

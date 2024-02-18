// Problem Link: https://www.interviewbit.com/problems/addition-without-summation/

public class Solution {
    public int addNumbers(int A, int B) {
        int count = 0;
        for(int i=1; i<=A+B; i++) count++;
        return count;
    }
}

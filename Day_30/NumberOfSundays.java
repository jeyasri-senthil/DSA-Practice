// Problem Link: https://www.interviewbit.com/problems/number-of-sundays/

public class Solution {
    public int solve(String A, int B) {
        int day = 1;
        if(A.equals("Monday")) day = 7;
        if(A.equals("Tuesday")) day = 6;
        if(A.equals("Wednesday")) day = 5;
        if(A.equals("Thursday")) day = 4;
        if(A.equals("Friday")) day = 3;
        if(A.equals("Saturday")) day = 2;
        if(A.equals("Sunday")) day = 1;
        return B >= day ? (B - day) / 7 + 1 : 0;
    }
}

// Problem Link: https://www.interviewbit.com/problems/valid-password/

public class Solution {
    public int solve(String A) {
        String regex =  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=\\S+$).{8,15}+$";
        if(A.matches(regex)) return 1;
        else return 0;
    }
}

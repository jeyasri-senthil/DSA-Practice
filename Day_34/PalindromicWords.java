// Problem Link: https://www.interviewbit.com/problems/palindromic-words/

public class Solution {
    public int solve(String A) {
        String[] arr = A.split(" ");
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            String reverse = sb.reverse().toString();
            if(reverse.equals(arr[i])) count++;
        }
        return count;
    }
}

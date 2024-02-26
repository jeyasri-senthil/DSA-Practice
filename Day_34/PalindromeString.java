// Problem Link: https://www.interviewbit.com/problems/palindrome-string/

public class Solution {
    public int isPalindrome(String A) {
        A = A.replaceAll("[^a-zA-Z0-9]", "");
        String strA = A.toLowerCase();
        StringBuilder sb = new StringBuilder(strA);
        String reverse = sb.reverse().toString();
        if(reverse.equals(strA)) return 1;
        else return 0;
    }
}

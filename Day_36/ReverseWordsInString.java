// Problem Link: https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        String result = "";
        for(int i=strArr.length-1; i>=0; i--) {
            result += strArr[i]+" ";
        }
    return result.trim().replaceAll("\\s+", " ");
    }
}

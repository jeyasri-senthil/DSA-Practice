// Problem Link: https://leetcode.com/problems/remove-outermost-parentheses/description/

class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        String result = "";
        for(char c : s.toCharArray()) {
            if(c == '(' && count == 0) count++;
            else if(c == '(' && count >= 1) {
                result += c;
                count++;
            }
            else if(c == ')' && count > 1) {
                result += c;
                count--;
            }
            else if(c == ')' && count == 1) count--;
        }
        return result;
    }
}

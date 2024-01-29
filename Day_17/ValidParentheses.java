// Problem Link: https://leetcode.com/problems/valid-parentheses/description/
// Problem Link: https://www.codingninjas.com/studio/problems/795104

import java.util.*;
public class Solution {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        for(char iterator : charArray) {
            if(iterator == '(' || iterator == '[' || iterator == '{') stack.push(iterator);
            else {
                if(stack.isEmpty()) return false;
                char ch = stack.pop();
                if(ch == '(' && iterator == ')' || ch == '[' && iterator == ']' || ch == '{' && iterator == '}') continue;
                else return false;
            }
        }
        return stack.isEmpty();
    }
}

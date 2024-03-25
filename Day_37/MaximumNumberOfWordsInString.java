// Problem Link: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

// Brute-Force Solution
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<sentences.length; i++) {
            int count = 0;
            String[] strArr = sentences[i].split(" ");
            for(int j=0; j<strArr.length; j++) {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}

// Better Solution
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String currentString : sentences) {
            int currentLength = currentString.split(" ").length;
            if(currentLength > max) max = currentLength;
        }
        return max;
    }
}

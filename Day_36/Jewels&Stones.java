// Problem Link: https://leetcode.com/problems/jewels-and-stones/

// Better Solution
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(jewels);
        for(char c : stones.toCharArray()) {
            if(sb.toString().contains(String.valueOf(c))) count++;
        }
        return count;
    }
}

// Optimal Solution
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i<stones.length(); i++) {
            if(jewels.indexOf(stones.charAt(i)) > -1) count++;
        }
        return count;
    }
}

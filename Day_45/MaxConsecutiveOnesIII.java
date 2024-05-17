// Problem Link: https://leetcode.com/problems/max-consecutive-ones-iii/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length, maxLen = -1, left = 0, right = 0, zeroCount = 0;
        while(right < n) {
            if(nums[right] == 0) zeroCount++;
            while(zeroCount > k) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}

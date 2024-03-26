// Problem Link: https://leetcode.com/problems/jump-game/description/

class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int stepsLeft = nums[0];
        for(int i=1; i<n; i++) {
            stepsLeft--;
            if(stepsLeft < 0) return false;
            if(i == n-1) return true;
            if(stepsLeft < nums[i]) stepsLeft = nums[i];
        }
        return true;
    }
}

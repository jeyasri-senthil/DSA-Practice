// Problem Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

// BruteForce Solution
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] posArr = new int[n/2];
        int[] negArr = new int[n/2];
        int pos = 0, neg = 0;
        for(int i=0; i<n; i++){
            if(nums[i] > 0) posArr[pos++] = nums[i];
            else negArr[neg++] = nums[i];
        }
        for(int i=0; i<n/2; i++){
            nums[2*i] = posArr[i];
            nums[2*i+1] = negArr[i];
        }
        return nums;
    }
}

// Optimal Solution
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0, neg=1, n=nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos += 2;
            }
            else{
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
}

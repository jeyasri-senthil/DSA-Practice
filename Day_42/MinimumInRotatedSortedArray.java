// Problem Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length, low = 0, high = n-1, ans = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid+1;
            }
            else {
                ans = Math.min(ans, nums[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}

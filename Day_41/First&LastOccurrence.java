// Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums, target);
        int ub = upperBound(nums, target);
        int n = nums.length;
        if(lb == n || nums[lb] != target) return new int[]{-1, -1};
        return new int[]{lb, ub-1};
    }
    public static int lowerBound(int[] nums, int target) {
        int n = nums.length, low = 0, high = n-1, ans = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] >= target) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    public static int upperBound(int[] nums, int target) {
        int n = nums.length, low = 0, high = nums.length-1, ans = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] > target) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}

// Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

class Solution {
    public boolean search(int[] nums, int target) {
        boolean res = find(nums, target);
        return res;
    }
    public static boolean find(int[] nums, int target) {
        int n = nums.length, low = 0, high = n-1; 
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return true;
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low+1;
                high = high-1;
                continue;
            }
            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]) high = mid-1;
                else low = mid+1;
            }
            else {
                if(nums[mid] <= target && target <= nums[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return false;
    }
}

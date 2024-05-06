// Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution {
    public int search(int[] nums, int target) {
        int res = find(nums, target);
        return res;
    }
    public static int find(int[] nums, int target) {
        int n = nums.length, low = 0, high = n-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            // left portion sorted
            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]) high = mid-1;
                else low = mid+1;
            }
            // right portion sorted
            else {
                if(nums[mid] <= target && target <= nums[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
}

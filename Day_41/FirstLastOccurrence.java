// Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = firstPosition(nums, target);
        if(first == -1) return new int[] {-1, -1};
        int last = lastPosition(nums, target);
        return new int[]{first, last};
    }
    public static int firstPosition(int[] nums, int target) {
        int n = nums.length, low = 0, high = n-1, first = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                first = mid;
                high = mid-1;
            }
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return first;
    }
    public static int lastPosition(int[] nums, int target) {
        int n = nums.length, low = 0, high = n-1, last = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                last = mid;
                low = mid+1;
            }
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return last;
    }
}

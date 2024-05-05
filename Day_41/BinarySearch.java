// Problwm Link: https://leetcode.com/problems/binary-search/description/

class Solution {
    public int search(int[] nums, int target) {
        // Iterative Approach
        
        /*int low = 0, high = nums.length-1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return -1;*/

        // Recursive Approach
        int low = 0, high = nums.length-1;
        return binarySearch(nums, low, high, target);
    }
    public static int binarySearch(int[] nums, int low, int high, int target) {
        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}

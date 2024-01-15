// Problem Link: https://www.codingninjas.com/studio/problems/binary-search_972
// Problem Link: https://leetcode.com/problems/binary-search/description/

// Iterative Approach
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length, low = 0, high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}

// Recursive Approach
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length, low = 0, high = n-1;
        return binarySearch(nums, low, high, target);
    }
    public static int binarySearch(int[] nums, int low, int high, int target){
        if(low > high) return -1;
        int mid = (low + high) / 2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return binarySearch(nums, low, mid-1, target);
        else return binarySearch(nums, mid+1, high, target);
    }
}

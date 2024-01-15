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


// Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length, low = 0, high = n-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]) high = mid-1;
                else low = mid+1;
            }
            else {
                if(nums[mid] <= target && target <= nums[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
}

// Problem Link: https://www.codingninjas.com/studio/problems/search-in-rotated-sorted-array_1082554

import java.util.ArrayList;
public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int low = 0, high = n-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr.get(mid) == k) return mid;
            if(arr.get(low) <= arr.get(mid)) {
                if(arr.get(low) <= k && k <= arr.get(mid)) high = mid-1;
                else low = mid+1;
            }
            else {
                if(arr.get(mid) <= k && k <= arr.get(high)) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
}

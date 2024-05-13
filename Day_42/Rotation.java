// Problem Link: https://www.geeksforgeeks.org/problems/rotation4723/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=rotation

class Solution {
    int findKRotation(int nums[], int n) {
        // code here
        int low = 0, high = n-1, ans = Integer.MAX_VALUE, index = -1;
        while(low <= high) {
            if(nums[low] <= nums[high]) {
                if(nums[low] < ans) {
                    ans = nums[low];
                    index = low;
                }
                break;
            }
            int mid = (low + high)/2;
            if(nums[low] <= nums[mid]) {
                if(nums[low] < ans) {
                    ans = nums[low];
                    index = low;
                }
                low = mid+1;
            }
            else {
                if(nums[mid] < ans) {
                    ans = nums[mid];
                    index = mid;
                }
                high = mid-1;
            }
        }
        return index;
    }
}

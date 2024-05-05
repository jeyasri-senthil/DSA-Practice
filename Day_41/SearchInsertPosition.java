// Problem Link: https://leetcode.com/problems/search-insert-position/description/

class Solution {
    public int searchInsert(int[] arr, int x) {
        int low = 0, high = arr.length-1, ans = arr.length;
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[mid] >= x) {
                ans = mid;
                high = mid-1; 
            }
            else low = mid+1;
        }
        return ans;
    }
}

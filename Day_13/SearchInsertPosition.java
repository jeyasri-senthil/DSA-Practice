// Problem Link: https://www.codingninjas.com/studio/problems/algorithm-to-find-best-insert-position-in-sorted-array_839813
// Problem Link: https://leetcode.com/problems/search-insert-position/

public class Solution {
    public static int searchInsert(int [] arr, int m){
        // Write your code here.
        int n = arr.length, low = 0, high = n-1;
        int ans = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] >= m) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}

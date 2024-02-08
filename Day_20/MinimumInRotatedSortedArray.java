// Problem Link: https://www.codingninjas.com/studio/problems/rotated-array_1093219
// Problem Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

public class Solution {
    public static int findMin(int []arr) {
        // Write your code here.
        int n = arr.length, low = 0, high = n-1, ans = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = (low+high)/2;
            if(arr[low] <= arr[mid]) {
                ans = Math.min(ans, arr[low]);
                low = mid+1;
            }
            else {
                ans = Math.min(ans, arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}

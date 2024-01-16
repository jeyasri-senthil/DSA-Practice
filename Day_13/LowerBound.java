// Problem Link: https://www.codingninjas.com/studio/problems/lower-bound_8165382

public class Solution {
    public static int lowerBound(int[] arr, int n, int x) {
        // Write your code here
        int low = 0, high = n-1;
        int ans = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] >= x) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}

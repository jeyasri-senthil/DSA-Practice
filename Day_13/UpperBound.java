// Problem Link: https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383

public class Solution {
    public static int upperBound(int[] arr, int x, int n){
        // Write your code here.
        int low = 0, high = n-1, ans = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] > x) {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
}

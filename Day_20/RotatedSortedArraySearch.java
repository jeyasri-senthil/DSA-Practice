// Problem Link: https://www.codingninjas.com/studio/problems/search-in-a-rotated-sorted-array-ii_7449547
// Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

public class Solution {
    public static boolean searchInARotatedSortedArrayII(int[] arr, int k) {
        // Write your code here.
        int n = arr.length, low = 0, high = n-1;
        boolean boolValue = true;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == k) return boolValue;
            while (low < mid && arr[low] == arr[mid]) {
                low++;
            }

            if(arr[low] <= arr[mid]) {
                if(arr[low] <= k && k <= arr[mid]) high = mid-1;
                else low = mid+1;
            }
            else {
                if(arr[mid] <= k && k <= arr[high]) low = mid+1;
                else high = mid-1;
            }
        }
        return !boolValue;
    }
}

// Problem Link: https://www.naukri.com/code360/problems/occurrence-of-x-in-a-sorted-array_630456

public class Solution {
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int first = firstOccurrence(arr, x, n);
        int last = lastOccurrence(arr, x, n);
        if(first == -1 || last == -1) return 0;
        return ((last - first) + 1);
    }
    public static int firstOccurrence(int[] arr, int x, int n) {
        int low = 0, high = n-1, first = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == x) {
                first = mid;
                high = mid-1;
            }
            else if(arr[mid] > x) high = mid-1;
            else low = mid+1;
        }
        return first;
    }
    public static int lastOccurrence(int[] arr, int x, int n) {
        int low = 0, high = n-1, last = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == x) {
                last = mid;
                low = mid+1;
            }
            else if(arr[mid] > x) high = mid-1;
            else low = mid+1;
        }
        return last;
    }
}

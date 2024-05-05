// Problem Link: https://www.naukri.com/code360/problems/ceiling-in-a-sorted-array_1825401

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Write your code here.
      int floor = getFloor(a, n, x);
      int ceil = getCeil(a, n, x);
      return new int[]{floor, ceil};
    }
    public static int getFloor(int[] a, int n, int x) {
      int low = 0, high = n-1, ans = -1;
      while(low <= high) {
        int mid = (low + high)/2;
        if(a[mid] <= x) {
          ans = a[mid];
          low = mid+1;
        }
        else high = mid-1;
      }
      return ans;
    }
    public static int getCeil(int[] a, int n, int x) {
      int low = 0, high = n-1, ans = -1;
      while(low <= high) {
        int mid = (low + high)/2;
        if(a[mid] >= x) {
          ans = a[mid];
          high = mid-1;
        }
        else low = mid+1;
      }
      return ans;
    }
}

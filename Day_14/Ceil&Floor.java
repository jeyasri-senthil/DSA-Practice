// Problem Link: https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401

import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Write your code here.
      return new int[]{floor(a, n, x), ceil(a, n, x)};
    }
    public static int floor(int[] a, int n, int x) {
      int low = 0, high = n-1, floor = -1;
      while(low <= high) {
        int mid = (low + high) / 2;
        if(a[mid] <= x) {
          floor = a[mid];
          low = mid+1;
        }
        else high = mid-1;
      }
      return floor;
    }
    public static int ceil(int[] a, int n, int x) {
      int low = 0, high = n-1, ceil = -1;
      while(low <= high) {
        int mid = (low + high) / 2;
        if(a[mid] >= x) {
          ceil = a[mid];
          high = mid-1;
        }
        else low = mid+1;
      }
      return ceil;
    }
}

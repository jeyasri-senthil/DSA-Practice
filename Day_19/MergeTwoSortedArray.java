// Problem Link: https://www.codingninjas.com/studio/problems/merge-two-sorted-arrays-without-extra-space_6898839

import java.util.*;
public class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b){
        // Write your code here.
        int n = a.length, m = b.length;
        int left = n-1, right = 0;
        while(left >= 0 && right < m) {
            if(a[left] > b[right]) {
                long temp = a[left];
                a[left] = b[right];
                b[right] = temp;
                left--;
                right++;
            }
            else break;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}

// Problem Link: https://leetcode.com/problems/merge-sorted-array/description/

import java.util.*;
class Solution {
    public void merge(int[] a, int n, int[] b, int m) {
        int i = n-1, j = m-1, k = n+m-1;
        while(i >= 0 && j >= 0) {
            if(a[i] > b[j]) {
                a[k--] = a[i--];
            }
            else a[k--] = b[j--];
        }
        while(i >= 0) a[k--] = a[i--];
        while(j >= 0) a[k--] = b[j--];
    }
}

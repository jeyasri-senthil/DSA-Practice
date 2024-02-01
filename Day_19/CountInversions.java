// Problem Link: https://www.codingninjas.com/studio/problems/number-of-inversions_6840276

// Brute-Force Solution
public class Solution {
    public static int numberOfInversions(int[] a, int n) {
        // Write your code here.
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[i] > a[j]) count++;
            }
        }
        return count;
    }
}

// Optimal Solution
import java.util.*;
public class Solution {
    public static int mergeSort(int[] arr, int low, int high){
        // Write your code here
        if(low < high){
            int mid = (low+high)/2;
            int count = 0;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid+1, high);
            count += merge(arr, low, mid, high);
            return count;
        }
        return 0;
    }
    public static int merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low; 
        int right = mid+1;
        int count = 0;
        while(left<=mid && right<=high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                count += (mid - left+1);
                right++;
            }
        }
        while(left<=mid){
                temp.add(arr[left]);
                left++;
        }
        while(right<=high){
                temp.add(arr[right]);
                right++;
        }
        for(int i=low; i<= high; i++){
            arr[i] = temp.get(i-low);
        }
        return count;
    }
    public static int numberOfInversions(int[] a, int n) {
        // Write your code here.
        return mergeSort(a, 0, n-1);
    }
}

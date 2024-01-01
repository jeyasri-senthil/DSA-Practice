// Problem Link: https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279

public class LargestElement {
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(max < arr[i]) 
                max = arr[i];
        }
        return max;
    }
}
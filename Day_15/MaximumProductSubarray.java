// Problem Link: https://leetcode.com/problems/maximum-product-subarray/description/
// Problem Link: https://www.codingninjas.com/studio/problems/subarray-with-maximum-product_6890008

public class Solution {
    public static int subarrayWithMaxProduct(int []arr){
        // Write your code here.
        int max = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1, n = arr.length;
        for(int i=0; i<n; i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
            prefix = prefix*arr[i];
            suffix = suffix*arr[n-i-1];
            max = Math.max(max, Math.max(prefix, suffix));
        }
        return max;
    }
}

// Problem Link: https://www.codingninjas.com/studio/problems/missing-and-repeating-numbers_6828164

// Brute-Force Solution
public class Solution {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        // Write your code here
        int n = a.length, repeating_num = -1, missing_num = -1;
        for(int i=1; i<=n; i++) {
            int count = 0;
            for(int j=0; j<n; j++) {
                if(a[j] == i) count++;
            }
            if(count == 2) repeating_num = i;
            else if(count == 0) missing_num = i;
            if(repeating_num != -1 && missing_num != -1) break;
        }
        return new int[]{repeating_num, missing_num};
    }
}

// Optimal Solution
public class Solution {
    public static int[] findMissingRepeatingNumbers(int[] a) {
        // Write your code here
        long n = a.length;
        long nSum = (n * (n+1))/2;
        long n2Sum = (n * (n+1) * (2*n+1))/6;
        long arrSum = 0, arr2Sum = 0;
        for(int i=0; i<n; i++) {
            arrSum += a[i];
            arr2Sum += (long)a[i] * (long)a[i];
        }
        long val1 = arrSum - nSum;
        long val2 = arr2Sum - n2Sum;
        val2 = val2 / val1;
        long X = (val1 + val2)/2;
        long Y = X - val1;
        return new int[]{(int) X , (int) Y};
    }
}

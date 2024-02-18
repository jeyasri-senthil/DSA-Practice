// Problem Link: https://www.interviewbit.com/problems/repeat-and-missing-number-array/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] a) {
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

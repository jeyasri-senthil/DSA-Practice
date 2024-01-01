// Problem Link: https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957

public class IsSorted {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=1; i<n; i++){
            if(a[i-1] <= a[i]){}
            else return 0;
        }
        return 1;
    }
}
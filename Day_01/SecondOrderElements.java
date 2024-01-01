// Problem Link: https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960

public class SecondOrderElements {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int largest = a[0];
        int secLargest = -1;
        for(int i=0; i<n; i++){
            if(a[i] > largest){
                secLargest = largest;
                largest = a[i];
            }
            else if(a[i] < largest && a[i] > secLargest) secLargest = a[i];
        }
        int smallest = a[0];
        int secSmallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(smallest > a[i]){
                secSmallest = smallest;
                smallest = a[i];
            }
            else if(smallest < a[i] && secSmallest > a[i]) secSmallest = a[i];
        }
        return new int[]{secLargest, secSmallest};
    }
}
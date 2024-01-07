// Problem Link: https://www.codingninjas.com/studio/problems/insertion-sort_624381

public class InsertionSort {
    public static void insertionSort(int[] arr, int n) {
        //Your code goes here
        for(int i=0; i<n; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
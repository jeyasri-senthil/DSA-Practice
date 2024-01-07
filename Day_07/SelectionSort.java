// Problem Link: https://www.codingninjas.com/studio/problems/selection-sort_624469

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
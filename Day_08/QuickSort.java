// Problem Link: https://www.codingninjas.com/studio/problems/quick-sort_5844

public class QuickSort {
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high){
			int partitionIndex = partition(arr, low, high);
			quickSort(arr, low, partitionIndex-1);
			quickSort(arr, partitionIndex+1, high);
		}
	}
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low, j = high;
		while(i<j){
			while(arr[i] <= pivot && i <= high-1) i++;
			while(arr[j] > pivot && j >= low+1) j--;
			if(i<j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		return j; 
	}
}

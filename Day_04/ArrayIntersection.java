// Problem Link: https://www.codingninjas.com/studio/problems/intersection-of-2-arrays_1082149

import java.util.* ;
public class ArrayIntersection {
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m){
		// Write Your Code Here.
		int i = 0, j = 0;
		ArrayList<Integer> result = new ArrayList<>();
		while(i<n && j<m){
			if(arr1.get(i) < arr2.get(j)) i++;
			else if(arr1.get(i) > arr2.get(j)) j++;
			else{
				result.add(arr1.get(i));
				i++;
				j++;
			} 
		}
		return result;
	}
}

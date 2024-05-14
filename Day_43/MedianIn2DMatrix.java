// Problem Link: https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=median-in-a-row-wise-sorted-matrix

class Solution {
    int median(int matrix[][], int R, int C) {
        // code here   
        int[] arr = new int[R*C];
        int index = 0;
        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                arr[index++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
}

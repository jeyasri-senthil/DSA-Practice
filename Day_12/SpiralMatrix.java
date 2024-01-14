// Problem Link: https://www.codingninjas.com/studio/problems/spiral-matrix_6922069

import java.util.*;
public class Solution {
    public static int[] spiralMatrix(int[][] matrix) {
        // Write your code here.
        int n = matrix.length, m = matrix[0].length;
        int top = 0, bottom = n-1;
        int left = 0, right = m-1;
        List<Integer> list = new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        int[] ans = new int[n*m];
        int i=0;
        for(int iterator : list){
            ans[i++] = iterator;
        }
        return ans;
    }
}

// Problem Link: https://leetcode.com/problems/spiral-matrix/description/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int top = 0, bottom = n-1;
        int left = 0, right = m-1;
        List<Integer> list = new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
    return list;
    }
}

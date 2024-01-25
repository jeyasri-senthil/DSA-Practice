// Problem Link: https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1; row<=numRows; row++) {
            List<Integer> tempList = new ArrayList<>();
            for(int col=1; col<=row; col++) {
                tempList.add(functionNCR(row-1, col-1));
            }
            ans.add(tempList);
        }
        return ans;
    }
    public static int functionNCR(int n, int r) {
        int res = 1;
        for(int i=0; i<r; i++) {
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
}

// Problem Link: https://www.codingninjas.com/studio/problems/print-pascal-s-triangle_6917910

import java.util.*;
public class Solution {
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int[][] result = new int[N][N];
        for(int i=0; i<N; i++) {
            result[i] = new int[i+1];
            result[i][0] = 1;
            for(int j=1; j<i; j++) {
                result[i][j] = result[i-1][j-1]+result[i-1][j];
            }
            result[i][i] = 1;
        }
        return result;
    }
}

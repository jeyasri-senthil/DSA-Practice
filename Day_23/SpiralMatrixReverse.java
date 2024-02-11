// Problem Link: https://www.interviewbit.com/problems/spiral-matrix/

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, int B, int C) {
        int top =0, left = 0, bottom = B-1, right = C-1;
        int direction = 0, index = 0;
        ArrayList<ArrayList<Integer>> spiralMatrix = new ArrayList<>();
        for(int i=0; i<B; i++) {
            spiralMatrix.add(new ArrayList<>(C));
            for(int j=0; j<C; j++) {
                spiralMatrix.get(i).add(0);
            }
        }
        while(top <= bottom && left <= right) {
            if(direction == 0) {
                for(int i=left; i<=right; i++) {
                    spiralMatrix.get(top).set(i, A.get(index));
                    index++;
                }
                top++;
            }
            else if(direction == 1) {
                for(int i=top; i<=bottom; i++) {
                    spiralMatrix.get(i).set(right, A.get(index));
                    index++;
                }
                right--;
            }
            else if(direction == 2) {
                for(int i=right; i>=left; i--) {
                    spiralMatrix.get(bottom).set(i, A.get(index));
                    index++;
                }
                bottom--;
            }
            else if(direction == 3) {
                for(int i=bottom; i>=top; i--) {
                    spiralMatrix.get(i).set(left, A.get(index));
                    index++;
                }
                left++;
            }
            direction = (direction+1) % 4;
        }
        return spiralMatrix;
    }
}

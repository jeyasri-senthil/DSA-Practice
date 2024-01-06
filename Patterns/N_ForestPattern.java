// Problem Link: https://www.codingninjas.com/studio/problems/n-forest_6570177

// Pattern Output
* * *
* * *
* * *

public class N_ForestPattern {
    public static void nForest(int n) {
        // Write your code here
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

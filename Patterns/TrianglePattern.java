// Problem Link: https://www.codingninjas.com/studio/problems/triangle_6573690

// Pattern Output
1
2 2 
3 3 3
public class TrianglePattern {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

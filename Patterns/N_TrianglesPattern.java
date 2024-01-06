// Problem Link: https://www.codingninjas.com/studio/problems/n-triangles_6573689

public class N_TrianglesPattern {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
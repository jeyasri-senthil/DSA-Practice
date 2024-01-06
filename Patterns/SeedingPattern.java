// Problem Link: https://www.codingninjas.com/studio/problems/seeding_6581892

public class SeedingPattern {
    public static void seeding(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
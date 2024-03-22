// Problem Link: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisible-or-not-81b86ad7/

import java.util.*;
class TestClass {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = sc.nextInt();
        }
        // Write your code here
        int num = data[N-1];
        System.out.print(num%10 == 0? "Yes":"No");
    }
}

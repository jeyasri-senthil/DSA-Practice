// Problem Link: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/maximum-border-9767e14c/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int row = sc.nextInt(), col = sc.nextInt(), max = 0;
            String val;
            for(int j=0; j<row; j++) {
                int count = 0;
                val = sc.next();
                for(int k=0; k<col; k++) {
                    if(val.charAt(k) == '#') count++;
                }
                max = Math.max(max, count);
            }
            System.out.println(max);
        }
    }
}

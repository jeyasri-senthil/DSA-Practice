// Problem Link: https://prepinsta.com/tcs-codevita/c-program-for-square-free-number/

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int num = 99999999;
		ArrayList<Integer> factors = new ArrayList<>();
		for(int i=1; i<=num; i++) {
		    if(num % i == 0) factors.add(i);
		}
		ArrayList<Integer> squareList = new ArrayList<>();
		for(int i=2; i<=Math.sqrt(num); i++) {
		    int perfectSquare = i*i;
		    if(factors.contains(perfectSquare)) squareList.add(perfectSquare); 
		}
		factors.removeAll(squareList);
		int count = 0;
        for(int i=1; i<factors.size(); i++) {
            boolean freeFlag = true;
            for(int j=0; j<squareList.size(); j++) {
                if(factors.get(i) % squareList.get(j) == 0) {
                    freeFlag = false;
                    break;
                }
            }
            if(freeFlag) count++;
        }
        System.out.println(count);
	}
}

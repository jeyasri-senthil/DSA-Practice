// Problem Link: https://www.hackerrank.com/challenges/time-conversion/problem

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] timeArray = time.split(":");
        String hour = timeArray[0];
        String minute = timeArray[1];
        String second = timeArray[2].substring(0,2);
        String amPM = timeArray[2].substring(2,4);
        if(amPM.equals("AM")) {
            if(hour.equals("12")) hour = "00";
            System.out.print(hour+":"+minute+":"+second);
        }
        else {
            if(!hour.equals("12")) {
                int h = Integer.parseInt(hour);
                h = h+12;
                hour = ""+h;
            }
            System.out.print(hour+":"+minute+":"+second);
        }
    }
}

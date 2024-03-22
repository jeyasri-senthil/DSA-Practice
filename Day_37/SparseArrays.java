// Problem Link: https://www.hackerrank.com/challenges/sparse-arrays/problem

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        for(String q: queries) {
            int count = 0;
            for(String s : stringList) {
                if(s.equals(q)) count++;
            }
            list.add(count);
        }
        return list;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        int stringListCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < stringListCount; i++) {
            stringList.add(bufferedReader.readLine());
        }
        
        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < queriesCount; i++) {
            queries.add(bufferedReader.readLine());
        }
        
        List<Integer> res = Result.matchingStrings(stringList, queries);
        
        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}

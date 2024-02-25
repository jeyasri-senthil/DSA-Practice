// Problem Link: https://www.codingninjas.com/studio/problems/count-nodes-of-linked-list_5884

public class Solution {
    public static int length(Node head){
        //Your code goes here
        Node temp = head;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}

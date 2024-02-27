// Problem Link: https://www.codingninjas.com/studio/problems/delete-node-of-linked-list_8160463

public class Solution {
    public static Node deleteLast(Node head){
        // Write your code here
        if(head == null || head.next == null) return null;
        Node temp = head;
        while(temp.next.next != null) temp = temp.next;
        temp.next = null;
        return head;
    }
}

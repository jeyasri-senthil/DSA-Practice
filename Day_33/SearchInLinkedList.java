// Problem Link: https://www.codingninjas.com/studio/problems/search-in-a-linked-list_975381

public class Solution {
    public static int searchInLinkedList(Node head, int k) {
        // Write Your Code Here.
        Node temp = head;
        while(temp != null) {
            if(temp.data == k) return 1;
            temp = temp.next;
        }
        return 0;
    }
    
}

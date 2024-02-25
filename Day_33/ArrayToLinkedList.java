// Problem Link: https://www.codingninjas.com/studio/problems/introduction-to-linked-list_8144737

public class Solution {
    public static Node constructLL(int[] arr) {
        // Write your code here
        Node head = arrayToLinkedList(arr);
        return head;
    }
    public static Node arrayToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        Node temp = null;
        for(int i=1; i<arr.length; i++) {
            temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}

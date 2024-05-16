// Problem Link: https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-linked-list

class Solution {
    static Node constructLL(int arr[]) {
        // code here
        return convertToLL(arr);
    }
    public static Node convertToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}

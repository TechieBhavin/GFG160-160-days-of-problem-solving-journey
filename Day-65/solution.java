// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node cur = head;
        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}

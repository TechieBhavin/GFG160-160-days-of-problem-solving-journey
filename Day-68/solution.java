/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
        // code here
         Node prev= new Node(-1);
        Node first=prev;
        
        while(head != null){
            int c=0;
            Node t=head;
            Node last=head;
            while(head != null && c++<k){
                Node next= head.next;
                head.next=last;
                last=head;
                head=next;
            }
            t.next=null;
            prev.next=last;
            prev=t;
        }
        return first.next;
    }
}

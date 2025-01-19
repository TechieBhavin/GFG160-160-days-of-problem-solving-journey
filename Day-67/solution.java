/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        // add code here
        if(head==null || head.next==null) return head;
        
        Node t = head;
        int l=1;
        while(t.next!=null){
            l++;
            t=t.next;
        }
        
        k%=l;
        if(k==0) return head;
        
        l=1;
        Node cur = head;
        
        while(cur.next!=null){
            if(l==k) break;
            l++;
            cur=cur.next;
        }
        
        t.next=head;
        head=cur.next;
        cur.next=null;
        
        return head;
    }
}

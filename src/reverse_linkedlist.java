public class reverse_linkedlist {

    public ListNode duplicate(ListNode head) {
        ListNode curr = head;
        while (curr!=null && curr.next!=null) {
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        // Create nodes
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(4);

        // Connect nodes (create linked list)
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // head of list
        ListNode head = n1;

        reverse_linkedlist obj = new reverse_linkedlist();

        // Reverse the list
        ListNode reversedHead = obj.duplicate(head);

        // Print reversed list
        ListNode temp = reversedHead;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
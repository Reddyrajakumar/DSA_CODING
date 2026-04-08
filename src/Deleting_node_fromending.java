public class Deleting_node_fromending {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        head.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        int n=2;
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.id+"->");
            temp=temp.next;
        }
    }
}

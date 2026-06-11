public class ReverseLinkedList  {
    public static Node ReverseList(Node head){
        Node prv=null;
        Node currentNode=head;
        while(currentNode!=null){
            Node nextnode=currentNode.next;
            currentNode.next=prv;
            prv=currentNode;
            currentNode=nextnode;
        }
        return prv;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head=ReverseList(head);
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null");
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this .data=data;
        this.next=null;
    }
}

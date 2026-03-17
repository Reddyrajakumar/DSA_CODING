public class leetcode203 {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(6);
        Node n4=new Node(3);
        Node n5=new Node(4);
        Node n6=new Node(5);
        Node n7=new Node(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        Node result=removeElements(n1,6);
        printlist(result);
    }

    public static  Node removeElements(Node head, int val) {
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.id==val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }

    public static void printlist(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.id+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

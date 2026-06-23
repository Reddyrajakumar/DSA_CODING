public class Circular_list_Society_company_code {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node temp=head;
        for(int i=2;i<=10000;i++){
            temp.next=new Node(i);
            temp=temp.next;
        }
        temp.next=head; ///here we making list as circular list
        System.out.println(circular(head));
    }

    public static boolean circular(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}

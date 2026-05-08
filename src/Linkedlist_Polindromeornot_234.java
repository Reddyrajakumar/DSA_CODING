public class Linkedlist_Polindromeornot_234 {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(3);
        head.next.next=new Node(3);
        head.next.next.next=new Node(1);
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prv=null;
        Node current=fast;
        while(current!=null){
            Node temp=current.next;
            current.next=prv;
            prv=current;
            current=temp;
        }
        boolean ispalindrome=true;
        Node firsthalf=head;
        Node Secondhalf=prv;
        while(Secondhalf!=null){
            if(firsthalf.id!=Secondhalf.id){
                ispalindrome=false;
                break;
            }
            firsthalf=firsthalf.next;
            Secondhalf=Secondhalf.next;
        }
        String res=(ispalindrome)?"is palindrome":"not a palindrome";
        System.out.println(res);
    }
}

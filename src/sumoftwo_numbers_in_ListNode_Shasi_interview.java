import java.util.*;

public class sumoftwo_numbers_in_ListNode_Shasi_interview {
    public static void main(String[] args) {
        Node head=new Node(0);
        head.next=new Node(-1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(-3);
        head.next.next.next.next=new Node(1);
        int k=-2;
//        Set<Integer> set=new HashSet<>();
//        Node current=head;
//        while(current!=null){
//            int value=current.id-k;
//            if(set.contains(value)){
//                System.out.println(Arrays.toString(new int[]{value,current.id}));
//            }
//            set.add(current.id);
//            current=current.next;
//        }
        Node first=head;
        while(first!=null){
            Node second=first.next;
            while(second!=null){
                if(first.id+second.id==k){
                    System.out.println(first.id+" "+second.id);
                }
                second=second.next;
            }
            first=first.next;
        }
    }
}

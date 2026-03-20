import java.util.PriorityQueue;

public class kth_largestnumber_in_array {
    public static void main(String[] args) {
        int nums[]={3,2,1,5,6,4};
        int k=3;
        //by default we have (a,b)->a-b
        //small element high priority
        //if you change (a,b)->b-a then bigger element is higher priority
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int c:nums){
            q.offer(c);
            if(q.size()>k){
                q.poll();
            }
        }
        System.out.println(q);
    }
}

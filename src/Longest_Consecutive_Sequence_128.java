import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence_128 {
    public static void main(String[] args) {
        int nums[]={100,4,200,1,3,2};
        Set<Integer> set= new HashSet<>();
        for(int c:nums){
            set.add(c);
        }
        int max=0;
        for(int cc:set){
            if(!set.contains(cc-1)){
                int currentnum=cc;
                int count=1;
                while (set.contains(currentnum+1)){
                    currentnum++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        System.out.println(max);
    }
}

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_217 {
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        boolean result=false;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                result=true;
                break;
            }
            set.add(nums[i]);
        }
        System.out.println(result);
    }
}

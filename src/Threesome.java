import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesome {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> res=new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[left]);
                    res.add(nums[right]);
                    list.add(res);
                    left++;
                    right--;
                } else if (sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.println(list);
    }
}

import java.util.Arrays;

public class rotate_array_n_points {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        int n=3;
        rotate(nums,0,nums.length-1);
        rotate(nums,0,n-1);
        rotate(nums,n,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}

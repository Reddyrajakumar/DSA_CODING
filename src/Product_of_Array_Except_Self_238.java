import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product_of_Array_Except_Self_238 {
    public static void main(String[] args) {
        int nums[]={-1,1,0,-3,3};
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int product=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    product*=nums[j];
                }
            }
            result[i]=product;
        }
        System.out.println(Arrays.toString(result));
    }
}

public class three_some {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int target=9;
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    System.out.println(nums[i]+" "+nums[left]+" "+nums[right]);
                    System.exit(0);
                } else if (sum<target) {
                    left++;
                }else{
                    right--;
                }
            }
        }
    }
}

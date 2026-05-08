import java.util.Arrays;

public class Leetcode_4 {
    public static void main(String[] args) {
        int nums1[]={1,2};
        int nums2[]={3,4};
        int n=nums1.length;
        int m=nums2.length;
        int res[]=new int[n+m];
        int len=res.length;
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                res[k++]=nums1[i++];
            }else{
                res[k++]=nums2[j++];
            }
        }
        while(i<n){
            res[k++]=nums1[i++];
        }
        while(j<m){
            res[k++]=nums2[j++];
        }
        int l=res[len/2];
        if(res.length%2==0){
            double median=(l+(l-1))/2.0;
            System.out.println(median);
        }else{
            System.out.println(l);
        }
    }
}

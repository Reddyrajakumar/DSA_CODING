import java.util.Arrays;

public class merging_2_arrays_without_extraspace {
    public static void main(String[] args) {
       int a[]={1,5,8,9};
       int b[]={3,4,10};
       for(int i=0;i<a.length;i++){
           if(a[i]>b[0]){
               int temp=a[i];
               a[i]=b[0];
               b[0]=temp;
           }
           Arrays.sort(b);
       }
       for(int cc:a){
           System.out.print(cc+" ");
       }
       for(int dd:b){
           System.out.print(dd+" ");
       }
    }
}

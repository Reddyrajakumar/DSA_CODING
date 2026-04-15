import java.util.Arrays;

public class TCS_NQT_RemoveDuplicates_ReverseArray {
    public static void main(String[] args) {
        int a[]={1,2,3,2,4,1,5};
        Arrays.sort(a);
        int i=0;
        for(int j=1;j<a.length;j++){
            if(a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
        }
        for(int k=i;k>=0;k--){
            System.out.print(a[k]+" ");
        }
    }
}

import java.util.Arrays;

public class merging_two_sorted_arrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        int res[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            if(a[i]>b[0]){
                int temp=a[i];
                a[i]=b[0];
                b[0]=temp;
            }
            Arrays.sort(b);
        }
        System.arraycopy(a,0,res,0,a.length);
        System.arraycopy(b,0,res,a.length,b.length);
        System.out.println(Arrays.toString(res));
    }
}

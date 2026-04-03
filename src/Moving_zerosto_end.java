import java.util.Arrays;

public class Moving_zerosto_end {
    public static void main(String[] args) {
        int a[]={1,2,0,4,0,5};
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

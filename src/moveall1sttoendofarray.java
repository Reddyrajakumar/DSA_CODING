import java.util.Arrays;

public class moveall1sttoendofarray {
    public static void main(String[] args) {
        int a[]={1,0,1,2,3,8};
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]!=1){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

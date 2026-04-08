import java.util.Arrays;

public class Bubble_Sorting {
    public static void main(String[] args) {
        int a[]={1,6,5,3,2,8};
        int left=0;
        int right=a.length-1;
        while(left<right) {
            int i = left;
            while (i < right) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
                i++;
            }
            right--;
        }
        System.out.println(Arrays.toString(a));
    }
}

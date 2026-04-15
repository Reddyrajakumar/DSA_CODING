import java.util.Arrays;
import java.util.Stack;

public class Find_Previous_Smaller_Element {
    public static void main(String[] args) {
        int a[]={1,4,3,6,2,8};
        int result[]=new int[a.length];
        Stack<Integer> b=new Stack<>();
        for(int i=0;i<a.length;i++){
            while (!b.isEmpty() && b.peek()>=a[i]){
                b.pop();
            }
            if(b.isEmpty()){
                result[i]=-1;
            }else {
                result[i]=b.peek();
            }
            b.push(a[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}

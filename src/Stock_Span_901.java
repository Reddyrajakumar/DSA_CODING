import java.util.Arrays;
import java.util.Stack;

public class Stock_Span_901 {
    public static void main(String[] args) {
        int a[]={100,80,60,70,60,75,85};
        Stack<Integer> stack=new Stack<>();
        int result[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!stack.isEmpty() && a[stack.peek()]<=a[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]=i+1;
            }else{
                result[i]=i-stack.peek();
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(result));
    }
}

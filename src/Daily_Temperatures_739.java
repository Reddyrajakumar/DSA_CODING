import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperatures_739 {
    public static void main(String[] args) {
        int temperatures[]={73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(Daily_Temperatures_739.dailyTemperatures(temperatures)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int res[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int prvind=stack.pop();
                res[prvind]=i-prvind;
            }
            stack.push(i);
        }
        return res;
    }
}

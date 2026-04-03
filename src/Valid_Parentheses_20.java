import java.util.Stack;

public class Valid_Parentheses_20 {
    public static void main(String[] args) {
        String a="{}[](";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if("[{(".indexOf(c)!=-1){
                stack.push(c);
            } else {
                char cc=stack.peek();
                if((c=='}' && cc=='{') || (c==']' && cc=='[') || (c==')' && cc=='(')){
                    stack.pop();
                }
            }
        }
        String res=(stack.isEmpty())?"yes perfect string":"not a perfect string";
        System.out.println(res);
    }
}

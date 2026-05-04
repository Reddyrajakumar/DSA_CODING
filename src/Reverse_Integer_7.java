public class Reverse_Integer_7 {
    public static void main(String[] args) {
        int x=1534236469;
        int reverse=0;
        while(x!=0){
            int digit=x%10;
            if(reverse>Integer.MAX_VALUE/10 || reverse<Integer.MIN_VALUE/10){
                System.out.println(0);
                return;
            }
            reverse=(reverse*10)+digit;
            x/=10;
        }
        System.out.println(reverse);
    }
}

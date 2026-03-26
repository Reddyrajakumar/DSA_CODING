public class TCS_coding {
    public static void main(String[] args) {
        int a=12348;
        while(a>=10){
            int sum=0;
            while(a>0){
                sum=sum+(a%10);
                a/=10;
            }
            a=sum;
        }
        System.out.println(a);
    }
}

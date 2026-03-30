package TCS_Client;

public class Conver_number_to_single_digit_until_sumis_zero {
    public static void main(String[] args) {
        int a=875546;
        while (a>=10){
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

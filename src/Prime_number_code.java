import java.util.Scanner;

public class Prime_number_code {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        boolean result=true;
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                result=false;
            }
        }
        String finalres=result?"this is prime number":"not a prime";
        System.out.println(finalres);
    }
}

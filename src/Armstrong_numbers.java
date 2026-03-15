public class Armstrong_numbers {
    public static void main(String[] args) {
        int a=153;
        int b=a;
        int sum=0;
        while(a>0){
            int remainder=(a%10);
            sum+=(remainder*remainder*remainder);
            a=(a/10);
        }
        if(b==sum){
            System.out.println("Anagram");
        }else{
            System.out.println("not an anagram");
        }

    }
}

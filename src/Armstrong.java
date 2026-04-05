public class Armstrong {
    public static void main(String[] args) {
        int a=153;
        int temp=a;
        int len=(String.valueOf(a)).length();
        int sum=0;
        while(a>0){
            sum+=Math.pow(a%10,len);
            a/=10;
        }
        String res=(a==sum)?"Anagram":"not";
        System.out.println(res);
    }
}

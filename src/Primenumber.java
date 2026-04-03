public class Primenumber {
    public static void main(String[] args) {
        int n=10;
        if(isprimt(n)){
            System.out.println(n+" number is a prime");
        }else{
            System.out.println(n+" not a prime");
        }
    }

    public static boolean isprimt(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return  false;
            }
        }
        return true;
    }
}

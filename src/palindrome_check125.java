public class palindrome_check125 {
    public static void main(String[] args) {
        String a="aajaa";
        String s1=a.toLowerCase();
        int left=0;
        int right=a.length()-1;
        boolean res=true;
        while(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                res=false;
            }
            left++;
            right--;
        }

        if(res){
            System.out.println("yes");
        }
    }
}

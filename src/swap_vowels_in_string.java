import java.util.Arrays;

public class swap_vowels_in_string {
    public static void main(String[] args) {
        String a="IceCreAm";
        char b[]= a.toCharArray();
        int left=0;
        int right=a.length()-1;
        while(left<right){
            while(left<right && !isvowel(b[left])){
                left++;
            }
            while(left<right && !isvowel(b[right])){
                right--;
            }
            char temp=b[left];
            b[left]=b[right];
            b[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(b));
    }
    public static boolean isvowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}

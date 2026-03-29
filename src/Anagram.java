import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a="ascde".toLowerCase();
        String b="edasp".toLowerCase();
//        char[] a1=a.toCharArray();
//        char[] b1=b.toCharArray();
//        Arrays.sort(a1);
//        Arrays.sort(b1);
//        if(Arrays.equals(a1,b1)){
//            System.out.println("Anagram");
//        }else{
//            System.out.println("not Anagram");
//        }
        int c[]=new int[26];
        if(a.length()!=b.length()){
            System.out.println("not anagram");
            return;
        }
        for(int i=0;i<a.length();i++){
            c[a.charAt(i)-'a']++;
            c[b.charAt(i)-'a']--;
        }
        for(int cc:c){
            if(cc!=0){
                System.out.println("not palindrome");
            }
        }
    }
}

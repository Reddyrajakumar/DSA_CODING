import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a="listen";
        String b="silen";
        System.out.println(Anagram.checkanagram(a,b));
    }
    public static String checkanagram(String a,String b){
        char c[]=new char[25];
        if(a.length()!=b.length()){
            return "not an anagram";
        }
        for(int i=0;i<a.length();i++){
            c[a.charAt(i)-'a']++;
            c[b.charAt(i)-'a']--;
        }
        for(int cc:c){
            if(cc!=0){
                return "not anagram";
            }
        }
        return "anagram";
    }
}

package Wissen_Client_round1;

import java.util.HashSet;
import java.util.Set;

public class sub_string_count_withput_duplicates {
    public static void main(String[] args) {
        String a="aab";
        Set<String> set=new HashSet<>();
        int k=2;
        for(int i=0;i<=a.length()-k;i++){
            String sub=a.substring(i,i+k);
            set.add(sub);
        }
        System.out.println(set);
    }
}

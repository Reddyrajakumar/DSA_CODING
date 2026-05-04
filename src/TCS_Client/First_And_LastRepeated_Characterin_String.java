package TCS_Client;

import java.util.HashSet;
import java.util.Set;

public class First_And_LastRepeated_Characterin_String {
    public static void main(String[] args) {
        String a="aabbcc";
        int first=0;
        String firstrepeated="";
        String lastrepeated="";
        Set<Character> set=new HashSet<>();
        for(int i=0;i<a.length();i++){
            if(set.contains(a.charAt(i))){
                if(first==0){
                    first++;
                    firstrepeated=String.valueOf(a.charAt(i));
                }
                else{
                    lastrepeated=String.valueOf(a.charAt(i));
                }
            }
            set.add(a.charAt(i));
        }
        System.out.println(firstrepeated+" "+lastrepeated);
    }
}

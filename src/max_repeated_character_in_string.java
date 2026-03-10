import java.util.HashMap;
import java.util.Map;

public class max_repeated_character_in_string {
    public static void main(String[] args) {
        String a="raja";
        int count=0;
        char v=' ';
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<a.length();i++){
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
        }
        for(char c:map.keySet()){
            if(map.get(c)>count){
                count=map.get(c);
                v=c;
            }
        }
        System.out.println(v);
    }
}

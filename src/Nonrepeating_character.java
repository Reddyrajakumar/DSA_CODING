import java.util.LinkedHashMap;
import java.util.Map;

public class Nonrepeating_character {
    public static void main(String[] args) {
        String a="rajajn";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:a.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char result='0';
        for(Map.Entry<Character,Integer> cc:map.entrySet()){
            if(cc.getValue()==1){
                result=cc.getKey();
                break;
            }
        }
        System.out.println(result);
    }
}

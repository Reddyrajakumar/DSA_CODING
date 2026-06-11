import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Morgan_Standely_code2 {
    public static void main(String[] args) {
        int[] a={1,1,5,5,5,8,7,7,7,7};
        Map<Integer,Integer> map=new HashMap<>();
        for(int cc:a){
            map.put(cc,map.getOrDefault(cc,0)+1);
        }
        System.out.println(map);
        int index=0;
        while(!map.isEmpty()){
            int value=0;
            int key=0;
            for(Map.Entry<Integer,Integer> ff:map.entrySet()){
                if(ff.getValue()>value){
                    value=ff.getValue();
                    key=ff.getKey();
                }
            }
            for(int i=index;i<(index+value);i++){
                a[i]=key;
            }
            map.remove(key);
            index+=value;
        }
        System.out.println(Arrays.toString(a));
    }
}

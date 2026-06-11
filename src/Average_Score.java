import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Average_Score {
    public static void main(String[] args) {
        String[][] scores = {
                {"Bob", "87"},
                {"Mike", "35"},
                {"Bob", "52"},
                {"Jason", "35"},
                {"Mike", "55"},
                {"Jessica", "99"}
        };
        Map<String,int[]> map=new HashMap<>();
        for(String[] c:scores){
            String name=c[0];
            int marks=Integer.parseInt(c[1]);
            map.putIfAbsent(name,new int[2]);
            map.get(name)[0]+=marks;
            map.get(name)[1]+=1;
        }
        for(Map.Entry<String,int[]> res:map.entrySet()){
            System.out.println(res.getKey()+" ->"+Arrays.toString(res.getValue()));
        }
        int max=Integer.MIN_VALUE;
        String finalname="";
        for(Map.Entry<String,int[]> res:map.entrySet()){
            int average=res.getValue()[0]/res.getValue()[1];
            if(average>max){
               finalname=res.getKey();
            }
        }
        System.out.println(finalname);
    }
}

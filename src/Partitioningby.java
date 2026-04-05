import java.util.*;
import java.util.stream.Collectors;

public class Partitioningby {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<Boolean,List<Integer>> map=list.stream().collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(map.get(true));
    }
}

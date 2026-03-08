import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class pratics {
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(1,2,3,4,5);
        List<Integer> result=IntStream.range(0,a.size()).mapToObj(i->a.get(a.size()-1-i)).toList();
        System.out.println(result);
    }
}

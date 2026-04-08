import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Merging_two_Lists_java8 {
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(1,5,3,6);
        List<Integer> b= Arrays.asList(2,4,9,7);
        List<Integer> res= Stream.concat(a.stream(),b.stream()).distinct().sorted().toList();
        System.out.println(res);
    }
}

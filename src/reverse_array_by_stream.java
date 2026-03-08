import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class reverse_array_by_stream {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int result[]= IntStream.range(0,a.length).map(i->a[a.length-1-i]).toArray();
        System.out.println(Arrays.toString(result));
    }
}

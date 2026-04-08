import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining_List_String_using_stream {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Veerabayannagari","Raja","Reddy");
        String res=list.stream().collect(Collectors.joining(","));
        System.out.println(res);
    }
}

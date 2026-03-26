import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class remove_duplicatewords_from_array {
    public static void main(String[] args) {
        String a="my name is raja my name";
        List<String> res= Arrays.stream(a.split(" ")).map(e->e.toLowerCase()).distinct().collect(Collectors.toList());
        System.out.println(res);
    }
}

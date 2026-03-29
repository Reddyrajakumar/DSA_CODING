import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_duplicate_count_inlist {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "apple",
                "banana",
                "apple",
                "orange",
                "banana",
                "grape"
        );
        list.stream().collect(Collectors.groupingBy(s->s,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
    }
}

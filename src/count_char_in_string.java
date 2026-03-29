import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class count_char_in_string {
    public static void main(String[] args) {
        String str = "programming";
        Long map=str.chars().mapToObj(d->(char) d).collect(Collectors.groupingBy(
                Function.identity(),Collectors.counting()
        )).entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
        System.out.println(map);
    }
}

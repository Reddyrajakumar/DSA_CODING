import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class first_non_repeatingchar_instring {
    public static void main(String[] args) {
        String input = "programming";
        char ff =input.chars().mapToObj(d->(char) d).collect(Collectors.groupingBy(
                Function.identity(),Collectors.counting()
        )).entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().get();
    }
}

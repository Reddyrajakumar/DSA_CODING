import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Remove_empty_string_inList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Raja","Kumar","",null," ");
        List<String> result=list.stream().filter(Objects::nonNull).filter(e->!e.isBlank()).toList();
        System.out.println(result);
    }
}

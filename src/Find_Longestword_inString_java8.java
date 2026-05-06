import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class Find_Longestword_inString_java8 {
    public static void main(String[] args) {
        String a="good morning";
        String result= Arrays.stream(a.split("\\s")).filter(Objects::nonNull).max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println(result);
    }
}

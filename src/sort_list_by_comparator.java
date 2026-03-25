import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sort_list_by_comparator {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4);
        List<String> list1 = Arrays.asList("java","python","sql","Java");
        list.sort(Comparator.comparingInt(Integer::intValue));
        list1.sort(Comparator.comparing(String::toString));
        System.out.println(list);
        System.out.println(list1);
    }
}

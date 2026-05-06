import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_Missing_numbers_in_array {
    public static void main(String[] args) {
        int a[]={1,2,1,2,5,8};
        int min= Arrays.stream(a).min().getAsInt();
        int max=Arrays.stream(a).max().getAsInt();
        Set<Integer> set=Arrays.stream(a).boxed().collect(Collectors.toSet());
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}

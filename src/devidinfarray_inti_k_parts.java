import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class devidinfarray_inti_k_parts {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        List<int []> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i += k) {

            int[] res =
                    Arrays.copyOfRange(
                            arr,
                            i,
                            i + k
                    );

            list.add(res);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(Arrays.toString(list.get(i)));
        }
    }
}

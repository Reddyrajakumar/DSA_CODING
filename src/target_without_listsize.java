import java.util.Arrays;
import java.util.List;

public class target_without_listsize {
    public static void main(String[] args) {
        List<Integer> list =
                Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);

        int left = 0;
        int right = 1;
        int target = 11;

        // Step 1: Expand range
        while (true) {
            try {
                if (list.get(right) >= target) {
                    break;
                }

                left = right;
                right = right * 2;

            } catch (IndexOutOfBoundsException e) {
                break; // stop expanding if index invalid
            }
        }

        // Step 2: Binary search
        while (left <= right) {

            int mid = left + (right - left) / 2;

            try {
                int value = list.get(mid);

                if (value == target) {
                    System.out.println(mid);
                    return;
                }
                else if (value > target) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }

            } catch (IndexOutOfBoundsException e) {
                right = mid - 1;
            }
        }

        System.out.println("-1");
    }
}

public class Swap_vowels_instring {
    public static void main(String[] args) {
        String s="IceCreAm";
        char[] res=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while (left<right && ("aeiouAEIOU".indexOf(res[left])==-1)){
                left++;
            }
            while (left<right && ("aeiouAEIOU".indexOf(res[right])==-1)){
                right--;
            }
            char temp=res[left];
            res[left]=res[right];
            res[right]=temp;
            left++;
            right--;
        }
        System.out.println(new String(res));
    }
}

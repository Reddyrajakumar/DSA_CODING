public class B_is_subset_of_A {
    public static void main(String[] args) {
        String a="abcabcabcd";
        String b="abcd";
        int i=0;int j=0;
        while(i<a.length()){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
                if(j==b.length()){
                    System.out.println("B is subset of A");
                    return;
                }
            }else{
                i=i-j+1;
                j=0;
            }
        }
        System.out.println("B is not a subset of A");
    }
}

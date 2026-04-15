import java.util.LinkedHashSet;

public class Finding_First_Repeated_Character {
    public static void main(String[] args) {
        String a="bcdabf";
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for(int i=0;i<a.length();i++){
            if(set.contains(a.charAt(i))){
                System.out.println(a.charAt(i));
                break;
            }
            set.add(a.charAt(i));
        }
    }
}

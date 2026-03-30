import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Wissen_client_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        int k=2;
        Set<String> c=new HashSet<>();
        for(int i=0;i<=a.length()-k;i++){
            String subs=a.substring(i,i+k);
            c.add(subs);
        }
        System.out.println(c);
    }
}

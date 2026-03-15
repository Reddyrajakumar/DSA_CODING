public class HCL_coding {
    public static void main(String[] args) {
        String a="MyNameIsRaja";
        for(int i=0;i<a.length();i++){
            if((a.charAt(i)>='A' && a.charAt(i)<='Z') && i!=0){
                System.out.print(" "+a.charAt(i));
            }else{
                System.out.print(a.charAt(i));
            }

        }
    }
}

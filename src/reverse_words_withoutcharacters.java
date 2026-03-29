public class reverse_words_withoutcharacters {
    public static void main(String[] args) {
        String input = "I love Java programming";
        String a[]=input.split("\\s");
        StringBuffer str=new StringBuffer();
        for(int i=a.length-1;i>=0;i--){
            str.append(a[i]).append(" ");
        }
        System.out.println(str.toString());
    }
}

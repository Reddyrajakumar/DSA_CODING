public class smalles_and_largest_word_in_string {
    public static void main(String[] args) {
        String a="My name Is RajaReddy";
        String b="";
        String length=a;//ths is for finding largest wordString length="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                b=b+a.charAt(i);
            }else {
                if (b.length()<length.length()) {  //b.length()>length.length() for finding max value
                    length = b;
                }
                b="";
            }
        }
        if(b.length()<length.length()){   ///b.length()>length.length() for finding max value
            length=b;
        }
        System.out.println(length);
    }
}

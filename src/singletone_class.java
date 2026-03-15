class Society_general_code_4 {
    private static  Society_general_code_4 instance=new Society_general_code_4();
    private Society_general_code_4(){
        System.out.println("this is constructor");
    }

    public static Society_general_code_4 getmethod(){
        return instance;
    }
}

public class singletone_class {
    public static void main(String[] args) {
        Society_general_code_4 result = Society_general_code_4.getmethod();
        Society_general_code_4 result1 = Society_general_code_4.getmethod();
    }
}
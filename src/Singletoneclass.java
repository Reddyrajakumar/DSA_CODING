public class Singletoneclass {
    public static void main(String[] args) {
        singletone s1=singletone.getinstance();
        s1.show();
    }
}
class singletone{
    private static singletone instance;
    private singletone(){};
    public static singletone getinstance(){
        if(instance==null){
            instance=new singletone();
        }
        return instance;
    }
    public void show(){
        System.out.println("this is singletone class");
    }
}

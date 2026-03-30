package TCS_Client.Functional_Interface;

public class imp{
    public static void main(String[] args) {
        Interfaceclass obj=(a)->{
            System.out.println("given number is  "+a);
        };
        obj.print(20);
    }
}

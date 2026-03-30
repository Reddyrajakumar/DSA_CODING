package TCS_Client.Customer_ErrorMessage;

public class Create_Exception {
    public static void main(String[] args) {
        int a=20;
        try{
            if(a<30){
                throw new CustomerNotFound("not found",400);
            }
        }catch (CustomerNotFound e){
            System.out.println(e.getErrorDetails());
        }
    }
}

package TCS_Client.Customer_ErrorMessage;

import java.time.LocalDate;

public class CustomerNotFound extends RuntimeException{

    private ErrorDetails errorDetails;
    public CustomerNotFound(String message,int code){
        super(message);
        this.errorDetails=new ErrorDetails(message,code, LocalDate.now());
    }

    public ErrorDetails getErrorDetails(){
        return errorDetails;
    }
}

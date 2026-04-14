package TCS_Client.Customer_ErrorMessage;

import java.time.LocalDate;

public class CustomerNotFound extends RuntimeException{

    private ErrorDetails errorDetails;
    public CustomerNotFound(String message){
        super(message);
        this.errorDetails=new ErrorDetails(message,HttpStatus.NOT_FOUND.getCode(), LocalDate.now());
    }

    public ErrorDetails getErrorDetails(){
        return errorDetails;
    }
}

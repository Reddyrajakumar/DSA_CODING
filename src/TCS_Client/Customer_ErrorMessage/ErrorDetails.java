package TCS_Client.Customer_ErrorMessage;

import java.time.LocalDate;

public class ErrorDetails {
    private String message;
    private int code;
    private LocalDate date;

    public ErrorDetails(String message, int code, LocalDate date) {
        this.message = message;
        this.code = code;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ErrorDetails{" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", date=" + date +
                '}';
    }
}

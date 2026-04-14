package TCS_Client.Customer_ErrorMessage;

public enum HttpStatus {
    BAD_REQUEST(400),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500),
    UNAUTHORIZED(401),
    FORBIDDEN(403);
    private int code;

    HttpStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

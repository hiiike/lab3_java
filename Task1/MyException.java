package Task1;

import java.util.ArrayList;
import java.util.List;

public class MyException extends RuntimeException{
private ErrorCode errorCode;
    List<String> message = new ArrayList<>();

    public List<String> getMessages() {
        return message;
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(List<String> message, ErrorCode errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }


}

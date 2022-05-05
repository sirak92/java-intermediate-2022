package pairs;

public class IllegalDataFormatException extends RuntimeException {

    public IllegalDataFormatException() {
    }

    public IllegalDataFormatException(String message) {
        super(message);
    }

    public IllegalDataFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalDataFormatException(Throwable cause) {
        super(cause);
    }
}

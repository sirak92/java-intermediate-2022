package copier;

import java.io.IOException;

public class FileNotValidException extends IOException {
    public FileNotValidException() {
    }

    public FileNotValidException(String message) {
        super(message);
    }

    public FileNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileNotValidException(Throwable cause) {
        super(cause);
    }
}

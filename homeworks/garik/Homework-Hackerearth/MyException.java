package hackerearth;

public class MyException extends Exception {
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MyException(String message) {
        this.message = message;


    }
}

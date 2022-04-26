package zoo;

public class NoFreeCagesException extends Exception{
    private String message;

    public NoFreeCagesException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

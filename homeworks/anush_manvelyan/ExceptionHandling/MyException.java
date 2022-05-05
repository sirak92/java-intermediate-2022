package tech42;

public class MyException extends Exception {
    private int param;

    MyException(int param) {
        this.param = param;
    }

    public String getMessage() {
        return ("MyException[" + param + "]");
    }

}

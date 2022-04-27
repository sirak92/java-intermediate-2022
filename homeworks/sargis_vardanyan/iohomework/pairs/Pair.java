package pairs;

public class Pair {
    private int number;
    private char symbol;

    private static final int DEFAULT_NUMBER_VALUE = 0;
    private static final char DEFAULT_SYMBOL_VALUE = ' ';

    public Pair() {
        this(DEFAULT_SYMBOL_VALUE, DEFAULT_NUMBER_VALUE);
    }

    public Pair(char symbol, int number) {
        this.number = number;
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String toString() {
        return this.symbol + " - " + this.number;
    }
}

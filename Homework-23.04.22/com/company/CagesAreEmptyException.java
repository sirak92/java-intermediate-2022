package com.company;

public class CagesAreEmptyException extends Exception {
    String s;

    CagesAreEmptyException(String s) {
        this.s = s;
    }
}

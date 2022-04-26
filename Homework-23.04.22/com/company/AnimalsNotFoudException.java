package com.company;

public class AnimalsNotFoudException extends RuntimeException {
    AnimalsNotFoudException() {
        super("there are no animals");
    }
}

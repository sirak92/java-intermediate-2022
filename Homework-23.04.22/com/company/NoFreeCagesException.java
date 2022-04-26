package com.company;

public class NoFreeCagesException extends Exception {
    NoFreeCagesException() {
        super("there are no free cages ");
    }

}

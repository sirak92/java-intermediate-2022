package com.company;

public class IndexIsNotValidException extends Exception{
    IndexIsNotValidException(){
        super("Index can't be negative or zero");
    }
}

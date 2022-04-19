package com.company;

import java.util.ArrayList;

public  class Zoo {

    private String ticket;
    private int price;

    ArrayList<String> employees = new ArrayList<>();

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}

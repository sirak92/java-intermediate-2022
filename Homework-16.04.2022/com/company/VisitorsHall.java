package com.company;

public class VisitorsHall {
    private boolean visitor;
    private int countOfSold = 0;

    public int sell() {
        if (visitor) {
            countOfSold++;
        }
        return countOfSold;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) throws EmptyArrayException, IndexIsNotValidException {
        int[] vals = {10, 12, 16, 3, 4, 5, 15};
        MyFunc checkArray = Main::myFunc;


        System.out.println(checkArray.myFunc(vals, 6));
    }

    private static boolean myFunc(int[] arr, int n) throws EmptyArrayException, IndexIsNotValidException {
        if (arr.length == 0) {
            throw new EmptyArrayException();
        }
        if (n <= 0) {
            throw new IndexIsNotValidException();


        }
        if (arr[n] % n == 0) {
            return true;
        }


        return false;
    }
}

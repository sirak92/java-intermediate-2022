package com.company;

public class Main {

    public static void main(String[] args) {
        MyInterface isOdd = (n) -> {
            if (n % 2 != 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(isOdd.myFunc(9));
        MyInterface isPrime = (n) -> {
            for (int i = 2; i <= n / 2; i++) {
                return n % i != 0;
            }
            return true;
        };
        System.out.println(isPrime.myFunc(4));
        MyInterface isPalindrome = (n) -> {
            String s;
            String result = "";
            int answer = 0;
            s = String.valueOf(n);
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
                answer = Integer.parseInt(result);


            }

            if (n == answer) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(isPalindrome.myFunc(111222111));


    }
}
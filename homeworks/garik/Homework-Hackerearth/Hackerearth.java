package hackerearth;

public class Hackerearth {
    static int divisionZero(int n, int m) throws MyException {
        if (m != 0) {
            return n / m;
        } else throw new MyException("Invalid division");

    }

    static void formatMismach(String s) throws MyException {
        String number = "123456789";
        for (int k = 0; k < s.length(); k++) {
            for (int i = 0; i < number.length(); i++) {
                if (s.charAt(k) == number.charAt(i)) {
                    throw new MyException("Format Mismach");
                }
            }
        }
    }

    static void indexinvalit(String s, int x) throws MyException {
        if (s.length() > x) {
            System.out.println(s.charAt(x));
        } else throw new MyException("Index invalit");
    }

    static void arrayIndexIsInvalit(int[] array, int i) throws MyException {
        if (i >= 0 && i <= array.length) {
            System.out.println(array[i]);
        } else throw new MyException("Array index is ivalit");
    }
}



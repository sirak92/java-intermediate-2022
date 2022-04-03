package recursion;

public class ReverseString {
    public static void reverseStringRecursion(String s) {
        if (s.length() == 1) {
            System.out.println(s);
            return;

        }
        System.out.print(s.substring(s.length() - 1));
        reverseStringRecursion(s.substring(0, s.length() - 1));
    }
}

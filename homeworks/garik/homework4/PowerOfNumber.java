public class PowerOfNumber {
    /**
     * find the degree of the number through a recursion
     * @param number
     * @param degree
     * @return
     */
    static int PowerOfNumberRecursive(int number, int degree) {
        if (degree == 0)
            return 1;
        else
            return number * PowerOfNumberRecursive(number, degree - 1);
    }
    public static void main(String[] args) {
        System.out.println(PowerOfNumberRecursive(4, 3));
    }

}

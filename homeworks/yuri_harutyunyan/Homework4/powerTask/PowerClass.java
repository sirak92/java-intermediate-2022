public class PowerClass {
    static int power(int num, int pow) {
        if (pow != 1) {
            num = num * power(num, (pow - 1));
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
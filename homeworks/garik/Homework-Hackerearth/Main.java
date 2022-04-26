package hackerearth;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Hackerearth.divisionZero(10, 0));
        } catch (MyException myException) {
            System.out.println(myException.getMessage());
        }
        try {
            Hackerearth.formatMismach("dd40dd");
        } catch (MyException myException) {
            System.out.println(myException.getMessage());
        }
        try {
            Hackerearth.indexinvalit("vndfijnvdin", 13);
        } catch (MyException myException) {
            System.out.println(myException.getMessage());
        }
        try {
            Hackerearth.arrayIndexIsInvalit(new int[]{1, 5, 6, 7, 8, 9, 10}, 12);
        } catch (MyException myException) {
            System.out.println(myException.getMessage());
        }
        System.out.println("Exception Handling Completed");
    }
}

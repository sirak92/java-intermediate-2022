import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What bouquet do you have? ");
        int bouquet = console.nextInt();
        String[] flowers = new String[]{
                "Chamomile ", "Roses ", "Tulips ", "Chrysanthemums "
        };

        for (String flower : flowers) {
            if ((bouquet & 1) == 1) {
                System.out.print(flower);
            }
            bouquet = bouquet >> 1;
        }
    }
}
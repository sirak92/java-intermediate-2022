package bitwiseop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlowerBouquet {
    private static final String[] flowerTypes31Item = new String[31];
    private static final String[] flowerTypes32Item = new String[32];

    // Initializing flowerTypes
    static {
        for (int i = 0; i < flowerTypes31Item.length; i++) {
            flowerTypes31Item[i] = "flowerType[" + i + "]";
            flowerTypes32Item[i] = "flowerType[" + i + "]";
        }
        flowerTypes32Item[31] = "flowerType[31]";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bouquet = scanner.nextInt();
        scanner.close();

        printBouquetFlowerTypes(flowerBouquet(bouquet));
        printBouquetFlowerTypes(flowerBouquetExtraExtra(bouquet));
    }

    // method receives int as a bouquet some or all flowerTypes
    // returns containing flowerTypes as a new List
    // for 31 flower types
    public static List<String> flowerBouquet(int bouquet) {
        List<String> bouquetFlowerTypes = new ArrayList<>();

        int currentIndex = 0;
        for (int i = 0; i < 31; i++) {
            if ((bouquet & 1) == 1) {
                bouquetFlowerTypes.add(flowerTypes31Item[currentIndex]);
            }
            bouquet >>= 1;
            currentIndex++;
        }
        return bouquetFlowerTypes;
    }

    // for 32 flower types
    public static List<String> flowerBouquetExtraExtra(int bouquet) {
        List<String> bouquetFlowerTypes = new ArrayList<>();
        int minusBouquet = -bouquet;

        int currentIndex = 0;
        for (int i = 0; i < 32; i++) {
            if ((minusBouquet & 1) == 1) {
                bouquetFlowerTypes.add(flowerTypes32Item[currentIndex]);
            }
            minusBouquet >>>= 1;
            currentIndex++;
        }
        return bouquetFlowerTypes;
    }

    public static void printBouquetFlowerTypes(List<String> bouquetFlowers) {
        System.out.println(bouquetFlowers);
    }
}

import java.util.Arrays;

    public class Task306 {
        public static void main(String[] args) {
            int[] array = new int[75];
            int current = 15;
            int index = 0;

            for (int i = 0; i <= array.length; i++) {
                int currentPointer = current % 10;
                int currentTens = current / 10;
                if ((currentPointer + currentTens) > 5) {
                    array[index] = current;
                    index++;
                }
                current++;
            }
            System.out.print(Arrays.toString(array));
        }
    }
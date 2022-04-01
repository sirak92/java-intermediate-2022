import java.util.Arrays;

public class Task341 {
	public static void main(String[] args) {
		int[] array = new int[]{1, 6, 2, 6, 1, 9, 5, 9};
		int amount = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					amount++;
				}
			}
		}
		System.out.print(array.length - amount);
	}
}
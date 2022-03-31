import java.util.Arrays;

public class Task329 {
	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] newArray = new int[array.length];
		int sumOfTerms = 0;

		for (int i = 0; i < array.length; i++) {
			sumOfTerms += array[i];
			newArray[i] = sumOfTerms;
		}
		System.out.print(Arrays.toString(newArray));
	}
}
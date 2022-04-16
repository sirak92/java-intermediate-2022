import java.util.Scanner;
public class LeftRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		for(int i = 0; i < arrayLength; i++) {
			array[i] = sc.nextInt();
		}
		int numberOfRotations = sc.nextInt();
		while (numberOfRotations > 0) {
			int k = array[0];
			for (int i = 1; i <= arrayLength; i++) {
				if (i < arrayLength) {
					array[i - 1] = array[i];
				}
				else {
					array[i - 1] = k;
				}
			}
			numberOfRotations--;
		}
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
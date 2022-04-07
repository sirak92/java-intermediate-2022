import java.util.Scanner;

public class Recursion2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		System.out.println(power(x, a));
	}
	public static int power(int x, int a) {
		if(a == 1) {
			return x;
		}
		return x * power(x, a - 1);
	}
}
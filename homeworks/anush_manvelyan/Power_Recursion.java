import java.util.Scanner;

public class Power_Recursion{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("\n Enter your base number: ");
		int base = input.nextInt();

		System.out.print("\n Enter your exponent number: ");
		int exponent = input.nextInt();

		if (exponent < 0)
			exponent *= -1;

		System.out.print("\n Power (" + base + ", " + exponent + ") = ");
		System.out.println(power(base, exponent));
		
	}

	static int power(int base_num, int expo_num){
		if (expo_num == 0)
			return 1;
		else if (expo_num == 1)
			return base_num;
		else
			return base_num * power(base_num, expo_num - 1);		
	}

}
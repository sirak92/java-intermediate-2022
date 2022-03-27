import java.util.Scanner;

public class IntReverse{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		Reversal num = new Reversal();

		System.out.print("\nEnter a number: ");
		num.number = input.nextInt();

		System.out.println("\n" + Reversal.reverse(num.number));
		System.out.println("\nBy default function result: ");
		System.out.println(Integer.reverse(num.number));
	}
}

class Reversal{
	int number;

	static int reverse(int number){
		int rev = 0;

		while(number != 0)
		rev *= 10;
		rev += number % 10;
		number /= 10;

		return rev;
	}
}
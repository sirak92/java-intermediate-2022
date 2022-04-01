public class IntCompare{
	public static void main(String[] args){

		Comparison num = new Comparison();
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		num.number1 = input.nextInt();
		System.out.print("Enter the second number: ");
		num.number2 = input.nextInt();

		System.out.println(Comparison.compare(num));
		System.out.println("By default function result: ");
		System.out.println(Integer.compare(num.number1, num.number2));
	}
}

class Comparison {
    int number1, number2;

    static int compare(Comparison number) {
        if (number.number1 > number.number2)
            return 1;
        else if (number.number1 < number.number2)
            return -1;
        else
            return 0;
    }
}
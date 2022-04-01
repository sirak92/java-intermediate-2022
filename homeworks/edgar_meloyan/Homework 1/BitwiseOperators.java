import java.util.Scanner;

public class BitwiseOperators {
	public static void main(String[] args) {
		int p = 0, q = 0, r = 0;
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int k = console.nextInt();

		for(int i = 1; i < n; i++) 
		{
			for(int j = i + 1; j <= n; j++) 
			{
				if((i & j) < k && p < (i & j)) 
				{
					p = i & j;
				}
				if((i | j) < k && q < (i | j))
				{
					q = i | j;
				}
				if ((i ^ j) < k && r < (i ^ j))
				{
					r = i ^ j;
				}
			}
		}
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);

	}
}
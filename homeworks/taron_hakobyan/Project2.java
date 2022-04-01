public class Project2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
        String[] flowers = new String[31];
        for (int i = 0; i < flowers.length; ++i) {
            flowers[i] = "flower" + String.valueOf(i);
        }
        getFlowers(flowers,number);
    }

    static void getFlowers(String flowers[], int number) {
        int[] binaryLook = new int[31];
        for (int i = 30; i >= 0; i++) {
            binaryLook[i] = number % 2;
            number /= 2;
            if (binaryLook[i]==1){
                System.out.println(flowers[i]);
            }
        }
        
    }
}
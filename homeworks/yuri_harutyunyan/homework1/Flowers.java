import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String[] flowers = new String[31];
        for(int i=0;i<31;i++){
            if((a&1)==1){
                flowers[i]="flower";
            }
            a=a>>1;
            
            System.out.println(flowers[i]);
        }

    }
}

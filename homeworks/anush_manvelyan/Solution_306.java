public class Solution_306 {
    public static void main(String[] args) {

        int arr[] = new int[89];
        int j = 0;

        for (int i = 10; i <= 99; ++i){
            int sum = 0;
            sum = i / 10 + i % 10;

            if (sum > 5)
                arr[j++] = i;
        }

        for(int i = 0; i < j; ++i)
            System.out.println(arr[i]);
    }
}

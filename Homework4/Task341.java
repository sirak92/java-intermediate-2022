// Must be found the count of unique numbers in array.

public class Task341{

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 2, 8};
        int count = 0;
        boolean condition;
        for(int i = 0; i < arr.length; i ++) {
            condition = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    condition = false;
                    break;
                }
            }
            if (condition) {
                count++;

            }
        }
        System.out.println(count);



    }
}

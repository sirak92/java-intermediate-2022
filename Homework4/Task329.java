//Every member of  new array must be the sum of previous members of first array. b3=a1+a2+a3

public class Task329{

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7,8,9};
        int [] arr1 = new int[arr.length];
        int sumOfPrevious=0;
        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                arr1[i] = arr[i];
                sumOfPrevious = arr1[i];

            } else {
                arr1[i] = sumOfPrevious;
                arr1[i] = arr[i] + arr1[i];
                sumOfPrevious = arr1[i];

            }
        }

        for(int i = 0; i< arr1.length; i++) {
            System.out.println(arr1[i]);
        }



    }
}

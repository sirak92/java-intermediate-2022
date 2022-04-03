public class ArrayyReverse {

        static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        static void reverse(int[]  arr, int i) {
            if (i >= arr.length / 2) {
                return;
            }

            int temp;
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;


            reverse(arr,i+1);

        }


        public static void main(String[] args) {
            reverse(arr,0);
            for(int a =0;a<= arr.length;a++){
                System.out.println(arr[a]);
            }
        }

    }



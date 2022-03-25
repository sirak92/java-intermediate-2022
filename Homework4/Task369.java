// Must be found the min member of first array,that doesn't have its equal in second array.

{

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 12, 32, 0, 71, 6,};
        int[] arr2 = {4, 9, 7, 8, 3, 65, 1, 0};
        boolean condition;
        int maxOfArr1=0;

        for(int i = 0; i<arr1.length; i++){
            if(maxOfArr1<arr1[i]){
                maxOfArr1=arr1[i];
            }
        }
        int min=maxOfArr1;



        for (int i = 0; i < arr1.length; i++) {
            condition = true;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    condition = false;
                    break;
                }
            }

            if(condition) {
                if(min>arr1[i]){
                    min=arr1[i];
                }
            }
        }
        System.out.println(min);

    }
}

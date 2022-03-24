public class Problem341 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,1};
        int quantity =0;
        for(int i = 0 ; i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if((arr[i] == arr[j])&(i!=j)){
                    quantity++;
                }
            }
        }
        System.out.println(arr.length-quantity);
    }
}

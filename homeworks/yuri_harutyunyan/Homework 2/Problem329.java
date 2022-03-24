public class Problem329 {
    public static void main(String[] args) {
        int[] arr =  new int[]{1,2,3,4,5};
        int[] finalarr = new int[5];
        int sum =0;
        for(int i=0;i<arr.length;i++){
             sum= sum + arr[i];
            finalarr [i] = sum;
            System.out.println(finalarr[i]);
        }
    }
}

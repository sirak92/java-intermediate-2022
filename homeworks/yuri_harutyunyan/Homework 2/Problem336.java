public class Problem336 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,8,45,};
        int minNum = 0;
        int maxNum = 0;
        for(int i =0;i< arr.length;i++){
            if(minNum>=arr[i]){
                minNum=arr[i];
            }
            if(maxNum<= arr[i]){
                maxNum = arr[i];
            }
        }
        if(minNum<0){
            System.out.println(maxNum);
        }
        else{
            System.out.println("s=0");
        }
    }
}

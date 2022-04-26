
public class Home306{

    public static void main(String[] args) {

	int [] array={17,7,15,21,5,36,45,41,98,9,100};
    for(int i=0; i< array.length; i++){
        int num=array[i];
        int val=num%10+(num-num%10)/10;
        if(num>=10 && num<100 && val>5){
            int size=0;
            int []arr1=new int[++size];
            for(int j=0; j<arr1.length; j++){
                arr1[j]=num;
                System.out.println(arr1[j]);
            }
        }
     }


    }
}

//the implementation of power of number method 

public class Power {

    public static void main(String[] args) {

        PowerDemo p = new PowerDemo();
        System.out.println(p.pow(7, 0));

    }
}
class PowerDemo{
    int pow(int a, int n){
        if(n == 0){
            return 1;
        }
        else if(n == 1){

           return a;

       }

       return a * pow(a, n -1);

    }

}

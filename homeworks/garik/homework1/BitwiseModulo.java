

public class BitwiseModulo {
    public static void main(String[] args) {
        int k =0b01101;
        int i=0b100;
        int o=k&(i-1);

        System.out.println(k);
        System.out.println(i);
        System.out.println(o);
        //1000101&
        //0000011
    }
}
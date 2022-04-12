package computer;

public class Main {
    public static void main(String[] args) {
        Acer acer=new Acer("A515-51G-57TV","Windows 10",512,8);
        Asus asus= new Asus("Laptop 15 X509FL","Windows 10",1024,12,true,false);
        System.out.println(asus.toString());
        System.out.println(acer.toString());
    }


}

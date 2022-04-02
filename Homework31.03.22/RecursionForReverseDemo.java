//The implementation of reverse String by recursion:

public class RecursionForReverseDemo{

    public static void main(String[] args) {
	String str1 = "а р г е н т и н а   м а н и т  н е г р а";

    RecursionForReverse r = new RecursionForReverse();
    r.reverse(str1);

    }
}
  class RecursionForReverse{
      void  reverse(String a ){

        if(a.length() < 1){
             System.out.println(a);
        } else {
            System.out.print(a.charAt(a.length() - 1));
            reverse(a.substring(0, a.length() - 1));
        }


      }
  }

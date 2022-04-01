public class StringReverce {
    public static void main(String[] args) {
       reverseStringPrint("abcd");
    }
    static void reverseStringPrint(String s){
        if(s.length()==0){
            return;
        }
        System.out.println(s.charAt(s.length()-1));
        reverseStringPrint(s.substring(0,s.length()-1));

       }
 }

public class ReverseString {
    /**
     *  get the given sentence in reverse order
     * @param str
     */
    static void reverseStringrecursive(String str)
    {
        if(str.length()==0) System.out.println(str);
        else
            System.out.println(str.charAt(str.length()-1));
        reverseStringrecursive(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) {
        reverseStringrecursive("Hello");
    }
}

public class MinMax {

    public static void main(String[] args) {
    	 Minimaxi x = new Minimaxi();
         x.a = 56;
         x.b = 42;
         Minimaxi.minimum(x);
         System.out.println(Minimaxi.maximum(x));

         Integer minimum_x = Integer.min(x.a, x.b);
         System.out.println(minimum_x);

         Integer maximum_x = Integer.max(x.a, x.b);
         System.out.println(maximum_x);
    }  
}

class Minimaxi{
    int a, b;

    static int minimum(Minimaxi min) {
        if (min.a > min.b)
            return min.b;
        else
            return min.a;
    }

    static int maximum(Minimaxi max) {
        if (max.a > max.b)
            return max.a;
        else
            return max.b;
    }
}


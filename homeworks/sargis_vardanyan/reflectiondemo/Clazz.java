package reflectiondemo;

public class Clazz extends ClazzPapa{
    private int number;
    private String name;

    private static int clazzNumber;
    private static String clazzName;

    static {
        clazzNumber = 16;
        clazzName = "ReflectionClazz";
    }

    public static void foo() {
        System.out.println("static method foo");
    }

    public void bar() {
        System.out.println("method bar");
    }
}

class ClazzPapa {}

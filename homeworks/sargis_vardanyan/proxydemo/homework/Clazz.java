package proxydemo.homework;

public class Clazz<T> implements Inderface<T>{

    @Override
    public void canBeNull(T t) {
        System.out.println("parameter can be null method");
    }

    @Override
    public T canNotBeNull(@NotNull T t) {
        System.out.println("parameter can not be null method");
        return t;
    }
}

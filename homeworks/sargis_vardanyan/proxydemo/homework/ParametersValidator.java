package proxydemo.homework;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;

public class ParametersValidator {
    public static void main(String[] args) throws NoSuchMethodException {
       validParameters(null);
//        System.out.println(Clazz.class.getMethod("canNotBeNull", Object.class).
//                getParameters()[0].
//                getAnnotation(NotNull.class) != null);
    }

    static <T> void validParameters(T t) {
        boolean[] result;

        @SuppressWarnings("unchecked")
        Inderface<T> inderfaceProxy = (Inderface<T>) Proxy.newProxyInstance(
                ParametersValidator.class.getClassLoader(),
                new Class<?>[]{Inderface.class},
                new NotNullInvocationHandler<>(new Clazz<>())
        );
        inderfaceProxy.canBeNull(t);
        inderfaceProxy.canNotBeNull(t);
    }
}

package proxydemo.homework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class NotNullInvocationHandler<T> implements InvocationHandler {
    private Clazz<T> target;

    public NotNullInvocationHandler(Clazz<T> target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Parameter[] params = method.getParameters();
        for(int i = 0; i < params.length; i++) {
            if (params[i].getAnnotation(NotNull.class) != null) {
                if (args[i] == null) {
                    throw new NullPointerException(
                            method.getName() + " methods " + i + "th parameter should not be nul"
                    );
                }
            }
        }
        return method.invoke(target, args);
    }
}

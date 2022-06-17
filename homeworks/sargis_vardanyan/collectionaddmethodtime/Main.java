package proxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        System.out.println(proxyAddMethodInCollection(list));
        System.out.println(proxyAddMethodInCollection(list));
    }

    //TODO
    // time each collections add method
    // doesn't work expected way
    @SuppressWarnings("unchecked")
    public static <T> long proxyAddMethodInCollection(Collection<T> collection) {
        TimingInvocationHandler timeHandler = new TimingInvocationHandler(collection);
        Collection<T> collectionProxy = (Collection<T>) Proxy.newProxyInstance(
                Thread.currentThread().getContextClassLoader(),
                new Class[]{Collection.class},
                timeHandler
        );
        collectionProxy.add((T)new Object());

        return timeHandler.getMethodInvocationTime();
    }
}

class TimingInvocationHandler implements InvocationHandler {
    private Object target;

    public long getMethodInvocationTime() {
        return methodInvocationTime;
    }

    private long methodInvocationTime;

    public TimingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("add")) {
            Object result;
            long start = System.currentTimeMillis();
            result = method.invoke(target, args);
            methodInvocationTime = System.currentTimeMillis() - start;
            return result;
        } else {
            throw new RuntimeException("exception");
        }
    }
}

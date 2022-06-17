package reflectiondemo;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        System.out.println(getSuperClasses(Clazz.class));
        invokeDeclaredMethods(Clazz.class);
    }

    public static <T> List<Class<? super T>> getSuperClasses(Class<T> target) {
        List<Object> papas = new ArrayList<>();
        Class<? super T> currentSuper = target.getSuperclass();

        while (currentSuper != Object.class) {
            papas.add(currentSuper);
            currentSuper = currentSuper.getSuperclass();
        }
        papas.add(Object.class);
        return papas.stream().
                map(c -> (Class<? super T>)c).
                collect(Collectors.toList());
    }

    //todo case: methods with parameters, arguments initialization
    public static <T> void invokeDeclaredMethods(Class<T> target) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        Method[] methods = target.getDeclaredMethods();
        for(Method m: methods) {
            Object[] args = m.getParameterTypes();
            if (Modifier.isStatic(m.getModifiers())) {
                m.invoke(target, args);
            } else {
                Constructor<?> constructor = target.getConstructor();
                Parameter[] params = constructor.getParameters();
                m.invoke(constructor.newInstance((Object[]) params), args);
            }
        }
    }


}

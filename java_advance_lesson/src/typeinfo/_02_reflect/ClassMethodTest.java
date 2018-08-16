package typeinfo._02_reflect;

import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Methodable {
    private String name;

    public Methodable() {
    }

    public Methodable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("say...");
    }

    public void hello(String name) {
        System.out.println("hello " + name);
    }

    public static void dream(String what) {
        System.out.println("our dream is " + what);
    }
}

public class ClassMethodTest {
    public void callMethod(Object obj, Method method, Object... args) {
        try {
            method.invoke(obj, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCallMethod() {
        try {
            Method method = Methodable.class.getMethod("say");
            Methodable person = new Methodable();
            callMethod(person, method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCallMethodAndParam() {
        try {
            Method method = Methodable.class.getMethod("hello", String.class);
            Methodable person = new Methodable();
            callMethod(person, method, "mike");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCallStaticMethod() {
        try {
            Method method = Methodable.class.getMethod("dream", String.class);
            callMethod(null, method, "see sea");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

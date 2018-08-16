package typeinfo._02_reflect;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Newable {
    private String name;

    public Newable() {
    }

    public Newable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Newable{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ClassNewTest {
    public void createObj(Class<?> clz) {
        Object obj = null;
        try {
            obj = clz.getConstructor().newInstance();
            System.out.println(obj);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConstructor() {
        createObj(Object.class);
        createObj(Newable.class);
    }

    public void createObj(Constructor<?> cons, Object ... initargs) {
        try {
            Object obj = cons.newInstance(initargs);
            System.out.println(obj);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConstructorParameter() {
        try {
            createObj(String.class.getConstructor(String.class), "name");
            createObj(Newable.class.getConstructor(String.class), "name");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
//        createObj(TestClass.class, "name".getClass());
    }
}

package typeinfo._03_reflect;

import org.junit.jupiter.api.Test;

public class ClassIsTest {

    public void checkClassIs(Class clz) {
        System.out.println(String.format("---%s---", clz.getSimpleName()));
        System.out.println(String.format("isAnnotation=%s", clz.isAnnotation()));
        System.out.println(String.format("isAnonymousClass=%s", clz.isAnonymousClass()));
        System.out.println(String.format("isArray=%s", clz.isArray()));
        System.out.println(String.format("isEnum=%s", clz.isEnum()));
        System.out.println(String.format("isInterface=%s", clz.isInterface()));
        System.out.println(String.format("isLocalClass=%s", clz.isLocalClass()));
        System.out.println(String.format("isMemberClass=%s", clz.isMemberClass()));
        System.out.println(String.format("isPrimitive=%s", clz.isPrimitive()));
        System.out.println(String.format("isSynthetic=%s", clz.isSynthetic()));
    }

    @Test
    public void testCheckClassIs() {
        checkClassIs(int.class);
        checkClassIs(double.class);
        checkClassIs(Object.class);
        checkClassIs(String.class);
    }

    public void printClassIs(Class clz) {
        System.out.println(String.format("---%s---", clz.getName()));
        if (clz.isAnnotation()) {
            System.out.print("isAnnotation ");
        }
        if (clz.isAnonymousClass()) {
            System.out.print("isAnonymousClass ");
        }
        if (clz.isArray()) {
            System.out.print("isArray ");
        }
        if (clz.isEnum()) {
            System.out.print("isEnum ");
        }
        if (clz.isInterface()) {
            System.out.print("isInterface ");
        }
        if (clz.isLocalClass()) {
            System.out.print("isLocalClass ");
        }
        if (clz.isMemberClass()) {
            System.out.print("isMemberClass ");
        }
        if (clz.isPrimitive()) {
            System.out.print("isPrimitive ");
        }
        if (clz.isSynthetic()) {
            System.out.print("isSynthetic ");
        }
        System.out.println();
    }

    public @interface Property{
        String name() default "";
        String value() default "";
    }

    @Test
    public void testIsAnnotation() {
        printClassIs(Property.class);
    }

    interface Animal {
    }

    @Test
    public void testIsInterface() {
        printClassIs(Animal.class);
    }

    @Test
    public void testIsPrimitive() {
        printClassIs(int.class);
    }

    @Test
    public void testIsArray() {
        printClassIs(int[].class);
    }

    enum Season {
        SPRING, // 春
        SUMMER, // 夏
        AUTUMN, // 秋
        WINTER, // 冬
    }

    @Test
    public void testIsEnum() {
        printClassIs(Season.class);
    }

    @Test
    public void testIsLocal() {
        class Local {
        }
        printClassIs(Local.class);
    }

//    @Test
//    public void testIsAnonymous() {
//        Object obj = new Animal() {};
//        printClassIs(obj.getClass());
//    }

    private class Synthetic {
    }

    @Test
    public void testIsSynthetic() {
        Synthetic s = new Synthetic();

        try {
            printClassIs(Class.forName("typeinfo._01_rtti.ClassIsTest$1"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package typeinfo._01_rtti;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

public class ClassClassTest {
    public void nameClass(Class<?> meta) {
        System.out.println(meta);
    }

    @Test
    public void testClassClass() {
        nameClass(boolean.class);
        nameClass(char.class);
        nameClass(byte.class);
        nameClass(short.class);
        nameClass(int.class);
        nameClass(long.class);
        nameClass(float.class);
        nameClass(double.class);

        nameClass(void.class);
        nameClass(Object.class);
        nameClass(String.class);
    }

    @Test
    public void testClassClassArray() {
        nameClass(boolean[].class);
        nameClass(char[].class);
        nameClass(byte[].class);
        nameClass(short[].class);
        nameClass(int[].class);
        nameClass(long[].class);
        nameClass(float[].class);
        nameClass(double[].class);

//        nameClass(void[].class);
        nameClass(Object[].class);
        nameClass(String[].class);
    }

    @Test
    public void testClassGetClass() {
        Boolean t = true;
        Character c = 'A';
        Byte b = 0;
        Short s = 0;
        Integer i = 0;
        Long l = 0L;
        Float f = 1.0f;
        Double d = 1.0;

        nameClass(t.getClass());
        nameClass(c.getClass());
        nameClass(b.getClass());
        nameClass(s.getClass());
        nameClass(i.getClass());
        nameClass(l.getClass());
        nameClass(f.getClass());
        nameClass(d.getClass());

//        Void v = new Void();
        Object obj = new Object();
        String str = new String();
//        nameClass(v.getClass());
        nameClass(obj.getClass());
        nameClass(str.getClass());
    }

    @Test
    public void testClassGetClassArray() {
        boolean[] t = {true};
        char[] c = {'A'};
        byte[] b = {0};
        short[] s = {0};
        int[] i = {0};
        long l[] = {0L};
        float f[] = {1.0f};
        double[] d = {1.0};

        nameClass(t.getClass());
        nameClass(c.getClass());
        nameClass(b.getClass());
        nameClass(s.getClass());
        nameClass(i.getClass());
        nameClass(l.getClass());
        nameClass(f.getClass());
        nameClass(d.getClass());

        Object[] obj = {new Object()};
        String[] str = {new String()};
        nameClass(obj.getClass());
        nameClass(str.getClass());
    }

    @Test
    public void testClassType() {
        nameClass(Boolean.TYPE);
        nameClass(Character.TYPE);
        nameClass(Byte.TYPE);
        nameClass(Short.TYPE);
        nameClass(Integer.TYPE);
        nameClass(Long.TYPE);
        nameClass(Float.TYPE);
        nameClass(Double.TYPE);

        nameClass(Void.TYPE);
//        nameClass(Object.TYPE);
//        nameClass(String.TYPE);
    }

    public void detailClass(Class<?> meta) {
        System.out.println(String.format("name=%s", meta.getName()));
        System.out.println(String.format("isPrimitive=%s", meta.isPrimitive()));
        System.out.println(String.format("isArray=%s", meta.isArray()));
        System.out.println(String.format("isInterface=%s", meta.isInterface()));
        System.out.println(String.format("isAnnotation=%s", meta.isAnnotation()));

        if (meta.getSuperclass() != null) {
            System.out.println(String.format("getSuperclass=%s", meta.getSuperclass().getName()));
        }
    }

    @Test
    public void testDetailClass() {
        System.out.println("--int--");
        detailClass(int.class);

        System.out.println("--double--");
        detailClass(double.class);

        System.out.println("--Object--");
        detailClass(Object.class);

        System.out.println("--String--");
        detailClass(String.class);
    }

    @Test
    public void testDetailClassArray() {
        System.out.println("--int--");
        detailClass(int[].class);

        System.out.println("--double--");
        detailClass(double[].class);

        System.out.println("--Object--");
        detailClass(Object.class);

        System.out.println("--String--");
        detailClass(String.class);
    }
}

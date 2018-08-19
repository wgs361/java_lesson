package typeinfo._01_rtti;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

public class ClassClassTest {
    @Test
    public void testClassLevel() {
        class Test {
        }

        Test a = new Test();
        System.out.println(a.getClass());
        Test b = new Test();
        System.out.println(b.getClass());

        System.out.println(a.getClass() == a.getClass());

        System.out.println(Test.class);
        System.out.println(Test.class.getClassLoader());
    }

    public void print(Class meta) {
        System.out.println(meta);
    }

    @Test
    public void testClassClass() {
        print(boolean.class);
        print(char.class);
        print(byte.class);
        print(short.class);
        print(int.class);
        print(long.class);
        print(float.class);
        print(double.class);

        print(void.class);
        print(Object.class);
        print(String.class);
    }

    @Test
    public void testClassClassArray() {
        print(boolean[].class);
        print(char[].class);
        print(byte[].class);
        print(short[].class);
        print(int[].class);
        print(long[].class);
        print(float[].class);
        print(double[].class);

        //print(void[].class);
        print(Object[].class);
        print(String[].class);
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

        print(t.getClass());
        print(c.getClass());
        print(b.getClass());
        print(s.getClass());
        print(i.getClass());
        print(l.getClass());
        print(f.getClass());
        print(d.getClass());

        //Void v = new Void();
        Object obj = new Object();
        String str = new String();
        //print(v.getClass());
        print(obj.getClass());
        print(str.getClass());
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

        print(t.getClass());
        print(c.getClass());
        print(b.getClass());
        print(s.getClass());
        print(i.getClass());
        print(l.getClass());
        print(f.getClass());
        print(d.getClass());

        Object[] obj = {new Object()};
        String[] str = {new String()};
        print(obj.getClass());
        print(str.getClass());
    }

    @Test
    public void testClassType() {
        print(Boolean.TYPE);
        print(Character.TYPE);
        print(Byte.TYPE);
        print(Short.TYPE);
        print(Integer.TYPE);
        print(Long.TYPE);
        print(Float.TYPE);
        print(Double.TYPE);

        print(Void.TYPE);
        //print(Object.TYPE);
        //print(String.TYPE);
    }

}

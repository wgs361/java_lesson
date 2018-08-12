package _01_commons.wrapper;

import org.junit.jupiter.api.Test;

public class TestWrapper {
    public void print(String title, int value) {
        System.out.println(title + " int = " + value);
    }

    public void print(String title, Integer value) {
        System.out.println(title + " Integer = " + value);
    }

    public void print(String title, String value) {
        System.out.println(title + " String = " + value);
    }

    @Test
    public void test_cast() {
        int i = 10;
        Integer obj = 10;
        String str = "10";

        print("int->Integer", Integer.valueOf(i));
        print("int->String", String.valueOf(i));

        print("Integer->int", obj.intValue());
        print("Integer->String", String.valueOf(obj));

        print("String->int", Integer.valueOf(str));
        print("String->Integer", Integer.parseInt(str));
    }

    public void integer_equal(Integer a, Integer b) {
        System.out.println("a == b " + (a == b));
        System.out.println("a equals b " + a.equals(b));
    }

    @Test
    public void test_equal() {
        Integer a = 888;
        Integer b = 888;

        integer_equal(a, b);

        // 整型常量池 -128-127
        a = 88;
        b = 88;
        integer_equal(a, b);
    }
}

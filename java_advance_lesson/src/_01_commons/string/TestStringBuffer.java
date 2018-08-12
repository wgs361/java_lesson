package _01_commons.string;

import org.junit.jupiter.api.Test;

public class TestStringBuffer {
    @Test
    public void test_capacity() {
        StringBuffer a = new StringBuffer();
        System.out.println(a.capacity());

        StringBuffer b = new StringBuffer(100);
        System.out.println(b.capacity());

        StringBuffer c = new StringBuffer("abcde");
        System.out.println(c.capacity());
    }

    @Test
    public void test_append() {
        StringBuffer s = new StringBuffer();
        s.append("www");
        s.append(".sina");
        s.append(".com");
        System.out.println(s);

        s.insert(3, ".sohu");
        System.out.println(s);

        s.delete(8, 13);
        System.out.println(s);
    }

    public void append(StringBuffer sb, String str) {
        sb.append(str);
    }

    @Test
    public void test_ref_append() {
        StringBuffer s = new StringBuffer();
        s.append("www");
        s.append(".sina");
        s.append(".com");
        System.out.println(s);

        append(s, ".cn");
        System.out.println(s);
    }
}

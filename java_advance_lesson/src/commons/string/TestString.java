package commons.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestString {
    @Test
    public void test_init() {
        String a = null;
        String b = "abc";
        String c = new String("xyz");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        String abc = "abc";
        String abc_ = "abc";
        System.out.println("abc == abc_ = " + (abc == abc_));
        System.out.println("abc.equals(abc_) = " + abc.equals(abc_));

        String xyz = new String("xyz");
        String xyz_ = new String("xyz");
        System.out.println("xyz == xyz_ = " + (xyz == xyz_));
        System.out.println("xyz.equals(xyz_) = " + xyz.equals(xyz_));

        abc_ = "a" + "b" + "c";
        System.out.println("abc == abc_ = " + (abc == abc_));
    }

    @Test
    public void test_append() {
        String abc = "abc";
        String abc_ = "a";
        abc_ += "b";
        abc_ += "c";
        System.out.println("abc == abc_ = " + (abc == abc_));
    }

    @Test
    public void test_trim() {
        String s = "  abc\t";

        System.out.println(s.trim());
    }

    @Test
    public void test_substring() {
        String s = "one two three";

        int pos = s.indexOf(" ");
        System.out.println(s.substring(pos, pos + 4));
    }

    @Test
    public void test_replaceAll() {
        String s = "one two three";

        System.out.println(s.replaceAll("one", "ONE"));
    }

    @Test
    public void test_check() {
        String s = "abcXYZ";

        System.out.println(s.equals("abcXYZ"));
        System.out.println(s.equalsIgnoreCase("abcxyz"));

        System.out.println(s.contains("XY"));
        System.out.println(s.startsWith("abc"));
        System.out.println(s.endsWith("XYZ"));
    }

    @Test
    public void test_index() {
        String s = "abcXYZabc";

        System.out.println(s.indexOf("X"));
        System.out.println(s.indexOf("a", 1));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.lastIndexOf("a", 4));
    }

    @Test
    public void test_iter() {
        String s = "abc";

        for (int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
    }

    @Test
    public void test_array() {
        String s = "abcXYZ";

        System.out.println(Arrays.toString(s.getBytes()));
        System.out.println(Arrays.toString(s.toCharArray()));
    }

    @Test
    public void test_split() {
        String s = "one two three";

        System.out.println(Arrays.toString(s.split(" ")));
    }

    @Test
    public void test_case() {
        String s = "abc";

        System.out.println(s.toLowerCase());
        System.out.println(s.toLowerCase().toUpperCase());
    }

    @Test
    public void test_cast() {
//        System.out.println(String.valueOf(null));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf('a'));
        System.out.println(String.valueOf(1));
        System.out.println(String.valueOf(3.14));
    }
}

package commons.string;

import org.junit.jupiter.api.Test;

public class TestExercise {
    public String reverse(String str) {
        String ret = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ret += str.charAt(i);
        }

        return ret;
    }

    @Test
    public void test_reverse() {
        String s = "abcd";

        System.out.println(reverse(s));
    }

    public int count(String src, String key) {
        int ret = 0;
        int pos = 0;
        while ((pos = src.indexOf(key, pos)) != -1) {
            pos += key.length();
            ret++;
        }

        return ret;
    }

    @Test
    public void test_count() {
        String s = "abc_abc_abcxx";

        System.out.println(count(s, "abc"));
    }

    public int countUpperCase(String str) {
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A' <= c && c <= 'Z') {
                ret++;
            }
        }

        return ret;
    }

    @Test
    public void test_countUpperCase() {
        String s = "Abc_Abc_AbcXX";

        System.out.println(countUpperCase(s));
    }
}

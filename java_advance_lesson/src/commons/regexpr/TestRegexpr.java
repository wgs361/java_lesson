package commons.regexpr;

import org.junit.jupiter.api.Test;

public class TestRegexpr {
    @Test
    public void test_matches() {
        System.out.println("abc1".matches("abc\\d"));
        System.out.println("abc2".matches("abc\\d"));

        System.out.println("13710772088".matches("137[0-9]{8}"));
    }

    @Test
    public void test_replaceAll() {
        System.out.println("a1b2c3".replaceAll("\\d", "."));
    }
}

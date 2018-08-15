package _04_statement._01_if;

import org.junit.jupiter.api.Test;

public class IfTest {
    public boolean isPositive(int value) {
        if (value > 0) {
            return true;
        }

        return false;
    }

    @Test
    public void testIf() {
        System.out.println(isPositive(1));
        System.out.println(isPositive(-1));
    }

    public int sign(int value) {
        if (value < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    @Test
    public void testSign() {
        System.out.println(sign(1));
        System.out.println(sign(-1));
    }

    public int compare(int a, int b) {
        int ret = 0;
        if (a > b) {
            ret = 1;
        } else if (a < b) {
            ret = -1;
        } else {
            ret = 0;
        }

        return ret;
    }

    @Test
    public void testCompare() {
        System.out.println(compare(2, 1));
        System.out.println(compare(2, 2));
        System.out.println(compare(1, 2));
    }

    public char grade(int score) {
        char ret = 'A';
        if (score >= 90) {
            ret = 'A';
        } else if (score >= 80) {
            ret = 'B';
        } else if (score >= 70) {
            ret = 'C';
        } else if (score >= 60) {
            ret = 'D';
        } else {
            ret = 'E';
        }

        return ret;
    }

    @Test
    public void testGrade() {
        System.out.println(grade(95));
        System.out.println(grade(85));
        System.out.println(grade(75));
        System.out.println(grade(65));
        System.out.println(grade(55));
    }
}

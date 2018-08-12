package _01_commons.math;

import org.junit.jupiter.api.Test;

public class TestMath {
    public void print(String title, double result) {
        System.out.println(title + " = " + result);
    }

    @Test
    public void test_constant() {
        print("Math.E", Math.E);
        print("Math.PI", Math.PI);
    }

    @Test
    public void test_arithmetic() {
        print("Math.sqrt(2)", Math.sqrt(2));
        print("Math.pow(2, 3)", Math.pow(2, 3));

        print("Math.random()", Math.random());

        print("Math.min(1, 4)", Math.min(1, 4));
        print("Math.max(1, 4)", Math.max(1, 4));

        print("Math.ceil(2.5)", Math.ceil(2.5));
        print("Math.floor(2.5)", Math.floor(2.5));

        print("Math.round(2.5)", Math.round(2.5));
    }
}

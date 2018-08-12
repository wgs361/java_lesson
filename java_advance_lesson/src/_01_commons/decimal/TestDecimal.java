package _01_commons.decimal;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

public class TestDecimal {
    @Test
    public void test_decimal() {
        String rmb = DecimalFormat.getCurrencyInstance().format(1234567);
        System.out.println(rmb);

        DecimalFormat a = new DecimalFormat("###,###.##");
        System.out.println(a.format(123456.23));
    }
}

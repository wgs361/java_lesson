package _01_commons.time;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestTime {

    @Test
    public void test_millis() {
        System.out.println(System.currentTimeMillis());
    }

    @Test
    public void test_date() {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss SSS");
        System.out.println(format.format(date));
    }

    @Test
    public void test_parse() {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");

            String s = "2008年8月8日";
            Date d = format.parse(s);
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            System.out.println(format.format(d) + " 星期" + (c.get(Calendar.DAY_OF_WEEK) + 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

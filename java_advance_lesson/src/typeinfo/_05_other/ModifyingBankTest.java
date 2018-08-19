package typeinfo._05_other;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

class Bank {
    private final int fee = 10;
    private int money = 0;

    void save(int money) {
        this.money += money;
    }

    void take(int money) {
        this.money -= money;
    }

    int getMoney() {
        return money;
    }

    int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "fee=" + fee +
                ", money=" + money +
                '}';
    }
}

public class ModifyingBankTest {
    @Test
    public void testBank() {
        Bank bank = new Bank();
        bank.save(1000);
        bank.take(100);
        System.out.println(bank);
    }

    public void modify(Object obj, String name, int newValue) {
        Field field = null;
        try {
            field = obj.getClass().getDeclaredField(name);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        field.setAccessible(true);
        try {
            field.setInt(obj, newValue);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testModifyBank() {
        Bank bank = new Bank();
        bank.save(1000);
        modify(bank, "money", 50000);
        modify(bank, "fee", 0);
        bank.take(10000);
        System.out.println(bank);
    }
}

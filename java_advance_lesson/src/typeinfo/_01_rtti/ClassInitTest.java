package typeinfo._01_rtti;

import org.junit.jupiter.api.Test;

import java.util.Random;

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitTest.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitTest {
    public static Random rand = new Random(47);

    @Test
    public void testNotInit() {
        Initable test = null;

        Class clz = Initable.class;
        System.out.println(clz);

        System.out.println(Initable.staticFinal);
    }

    @Test
    public void testInit() {
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);

        Initable3 obj = new Initable3();
    }

    @Test
    public void testForName() {
        try {
            Class meta = Class.forName("typeinfo._01_rtti.Initable");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("pre new");
        Initable obj = new Initable();
        System.out.println("post new");
    }

    @Test
    public void testForNameFalse() {
        try {
            Class meta = Class.forName("typeinfo._01_rtti.Initable", false,
                    Thread.currentThread().getContextClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("pre new");
        Initable obj = new Initable();
        System.out.println("post new");
    }
}

package _03_express.algorithm;

public class IntDivide {
    // 规律是余数符号等于被除数符号
    static void printInt(int a, int b)
    {
        System.out.println("" + a + " % " + b + " = " + (a % b));
    }

    static void testInt(int a, int b)
    {
        printInt(a, b);
        printInt(b, a);
        printInt(-a, b);
        printInt(b, -a);
        printInt(a, -b);
        printInt(-b, a);
        printInt(-a, -b);
        printInt(-b, -a);
    }

    static void printFloat(double a, double b)
    {
        System.out.println("" + a + " % " + b + " = " + (a % b));
    }

    static void testFloat(double a, double b)
    {
        printFloat(a, b);
        printFloat(b, a);
        printFloat(-a, b);
        printFloat(b, -a);
        printFloat(a, -b);
        printFloat(-b, a);
        printFloat(-a, -b);
        printFloat(-b, -a);
    }

    public static void main(String args[])
    {
        testInt(5, 2);
        System.out.println();

        testFloat(6.0, 2.5);
        System.out.println();
    }
}

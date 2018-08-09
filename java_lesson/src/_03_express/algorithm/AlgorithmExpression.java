package _03_express.algorithm;

public class AlgorithmExpression {
    static void printInt(String s, int i)
    {
        System.out.println(s + " = " + i);
    }

    static void printFloat(String s, float f)
    {
        System.out.println(s + " = " + f);
    }

    static void printDouble(String s, double f)
    {
        System.out.println(s + " = " + f);
    }

    static void testInt(int a, int b)
    {
        printInt("a", a);
        printInt("b", b);
        printInt("a + b", a + b);
        printInt("a - b", a - b);
        printInt("a * b", a * b);
        printInt("a / b", a / b);	// 直接取整
        printInt("a % b", a % b);
    }

    static void testFloat(float a, float b)
    {
        printFloat("a", a);
        printFloat("b", b);
        printFloat("a + b", a + b);
        printFloat("a - b", a - b);
        printFloat("a * b", a * b);
        printFloat("a / b", a / b);
        printFloat("a % b", a % b);	// 允许存在
    }

    static void testDouble(double a, double b)
    {
        printDouble("a", a);
        printDouble("b", b);
        printDouble("a + b", a + b);
        printDouble("a - b", a - b);
        printDouble("a * b", a * b);
        printDouble("a / b", a / b);
        printDouble("a % b", a % b);	// 允许存在
    }

    public static void main(String[] args)
    {
        testInt(5, 2);
        System.out.println();

        testFloat(5.22f, 2.1f);
        System.out.println();

        testDouble(5.22, 2.1);
        System.out.println();
    }
}

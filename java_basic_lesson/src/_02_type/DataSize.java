package _02_type;

public class DataSize {
    static void testByte()
    {
        System.out.println("Byte MIN_VALUE:" + Byte.MIN_VALUE);
        System.out.println("Byte MAX_VALUE:" + Byte.MAX_VALUE);
        System.out.println("Byte SIZE:" + Byte.SIZE);

        System.out.println();
    }

    static void testShort()
    {
        System.out.println("Short MIN_VALUE:" + Short.MIN_VALUE);
        System.out.println("Short MAX_VALUE:" + Short.MAX_VALUE);
        System.out.println("Short SIZE:" + Short.SIZE);

        System.out.println();
    }

    static void testInteger()
    {
        System.out.println("Integer MIN_VALUE:" + Integer.MIN_VALUE);
        System.out.println("Integer MAX_VALUE:" + Integer.MAX_VALUE);
        System.out.println("Integer SIZE:" + Integer.SIZE);

        System.out.println();
    }

    static void testLong()
    {
        System.out.println("Long MIN_VALUE:" + Long.MIN_VALUE);
        System.out.println("Long MAX_VALUE:" + Long.MAX_VALUE);
        System.out.println("Long SIZE:" + Long.SIZE);

        System.out.println();
    }

    static void testFloat()
    {
        System.out.println("Float MIN_VALUE:" + Float.MIN_VALUE);
        System.out.println("Float MAX_VALUE:" + Float.MAX_VALUE);
        System.out.println("Float SIZE:" + Float.SIZE);
        System.out.println("Float MIN_EXPONENT:" + Float.MIN_EXPONENT);
        System.out.println("Float MAX_EXPONENT:" + Float.MAX_EXPONENT);
        System.out.println("Float MIN_NORMAL:" + Float.MIN_NORMAL);

        System.out.println();
    }

    static void testDouble()
    {
        System.out.println("Double MIN_VALUE:" + Double.MIN_VALUE);
        System.out.println("Double MAX_VALUE:" + Double.MAX_VALUE);
        System.out.println("Double SIZE:" + Double.SIZE);
        System.out.println("Double MIN_EXPONENT:" + Double.MIN_EXPONENT);
        System.out.println("Double MAX_EXPONENT:" + Double.MAX_EXPONENT);
        System.out.println("Double MIN_NORMAL:" + Double.MIN_NORMAL);

        System.out.println();
    }

    static void testBoolean()
    {
        System.out.println("Boolean FALSE:" + Boolean.FALSE);
        System.out.println("Boolean TRUE:" + Boolean.TRUE);

        System.out.println();
    }

    static void testCharacter()
    {
        System.out.println("Character MIN_VALUE:" + Character.MIN_VALUE);
        System.out.println("Character MAX_VALUE:" + Character.MAX_VALUE);
        System.out.println("Character SIZE:" + Character.SIZE);

        System.out.println();
    }

    public static void main(String[] args)
    {
        testByte();
        testShort();
        testInteger();
        testLong();

        testFloat();
        testDouble();

        testBoolean();
        testCharacter();
    }
}

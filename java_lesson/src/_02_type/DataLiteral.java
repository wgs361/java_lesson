package _02_type;

public class DataLiteral {
    static void printBoolean(String s, Boolean b)
    {
        System.out.println(s + " = " + b);
    }

    static void printByte(String s, Byte b)
    {
        System.out.println(s + " = " + b);
    }

    static void printShort(String s, Short b)
    {
        System.out.println(s + " = " + b);
    }

    static void printInteger(String s, Integer b)
    {
        System.out.println(s + " = " + b);
    }

    static void printLong(String s, Long b)
    {
        System.out.println(s + " = " + b);
    }

    static void printFloat(String s, Float b)
    {
        System.out.println(s + " = " + b);
    }

    static void printDouble(String s, Double b)
    {
        System.out.println(s + " = " + b);
    }

    static void printCharacter(String s, Character b)
    {
        System.out.println(s + " = " + b);
    }

    public static void main(String args[])
    {
        boolean isTrue = true;
        boolean isFalse = false;

        printBoolean("true", isTrue);
        printBoolean("false", isFalse);
        System.out.println();

        Byte b1 = 1;
        Byte b2 = 077;
        Byte b3 = 0x5F;
        printByte("Byte(1)", b1);
        printByte("Byte(077)", b2);
        printByte("Byte(0x5F)", b3);
        System.out.println();

        Short s1 = 1;
        Short s2 = 077;
        Short s3 = 0x5F;
        printShort("Short(1)", s1);
        printShort("Short(077)", s2);
        printShort("Short(0x5F)", s3);
        System.out.println();

        Integer i1 = 1;
        Integer i2 = 077;
        Integer i3 = 0x5F;
        printInteger("Integer(1)", i1);
        printInteger("Integer(077)", i2);
        printInteger("Integer(0x5F)", i3);
        System.out.println();

        Long l1 = 1L;
        Long l2 = 077L;
        Long l3 = 0x5FL;
        printLong("Long(1)", l1);
        printLong("Long(077)", l2);
        printLong("Long(0x5F)", l3);
        System.out.println();

        Float f1 = 1.1f;
        Float f2 = 1.1e2f;
        Float f3 = 1.1e-2f;
        printFloat("Float(1.1f)", f1);
        printFloat("Float(1.1e2f)", f2);
        printFloat("Float(1.1e-2f)", f3);
        System.out.println();

        Double d1 = 1.1;
        Double d2 = 1.1e2;
        Double d3 = 1.1e-2;
        printDouble("Double(1.1)", d1);
        printDouble("Double(1.1e2)", d2);
        printDouble("Double(1.1e-2)", d3);
        System.out.println();
    }
}

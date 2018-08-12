package _02_type;

public class DataInit {
    byte b;			// 0
    short s;		// 0
    int i;			// 0
    long l;			// 0

    float f;		// 0.0f
    double d;		// 0.0

    char c;			// '\u0000';
    boolean is;		// false

    String str;		// null

    public static void main(String[] args)
    {
        DataInit t = new DataInit();
        System.out.println("byte=" + t.b);
        System.out.println("short=" + t.s);
        System.out.println("int=" + t.i);
        System.out.println("long=" + t.l);

        System.out.println("float=" + t.f);
        System.out.println("double=" + t.d);

        System.out.println("char=" + t.c);
        System.out.println("boolean=" + t.is);

        System.out.println("String=" + t.str);
    }
}

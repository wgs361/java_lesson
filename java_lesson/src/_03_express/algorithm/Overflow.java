package _03_express.algorithm;

public class Overflow {
    public static void main(String[] args)
    {
        int big = 0x7fffffff;
        System.out.println("big = " + big);

        int bigger = big * 4;
        System.out.println("bigger = " + bigger);
    }
}

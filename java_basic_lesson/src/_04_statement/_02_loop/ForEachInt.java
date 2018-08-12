//: control/ForEachInt.java
package _04_statement._02_loop; /* Added by Eclipse.py */

import static utils.math.Range.range;
import static utils.print.Print.print;
import static utils.print.Print.printnb;

public class ForEachInt {
    public static void main(String[] args) {
        for (int i : range(10)) // 0..9
            printnb(i + " ");
        print();
        for (int i : range(5, 10)) // 5..9
            printnb(i + " ");
        print();
        for (int i : range(5, 20, 3)) // 5..20 step 3
            printnb(i + " ");
        print();
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
5 6 7 8 9
5 8 11 14 17
*///:~

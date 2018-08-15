package utils.container;

public class Tuple4<A, B, C, D> extends Tuple3<A, B, C> {
    public final D fourth;

    public Tuple4(A first, B second, C third, D fourth) {
        super(first, second, third);
        this.fourth = fourth;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + "," + fourth + ")";
    }
}

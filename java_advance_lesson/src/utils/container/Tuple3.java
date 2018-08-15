package utils.container;

public class Tuple3<A, B, C> extends Tuple2<A, B> {
    public final C third;

    public Tuple3(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + ")";
    }
}
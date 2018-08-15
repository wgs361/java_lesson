package utils.container;

public class Tuple2<A, B> extends Tuple1<A> {
    public final B second;

    public Tuple2(A first, B second) {
        super(first);
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}

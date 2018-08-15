package utils.container;

public class Tuple1<A> {
    public final A first;

    public Tuple1(A first) {
        this.first = first;
    }

    @Override
    public String toString() {
        return "(" + first + ")";
    }
}

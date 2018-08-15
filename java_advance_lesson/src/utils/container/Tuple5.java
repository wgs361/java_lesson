package utils.container;

public class Tuple5<A, B, C, D, E> extends Tuple4<A, B, C, D> {
    public final E fifth;

    public Tuple5(A first, B second, C third, D fourth, E fifth) {
        super(first, second, third, fourth);
        this.fifth = fifth;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + "," + fourth + "," + fifth + ")";
    }
}

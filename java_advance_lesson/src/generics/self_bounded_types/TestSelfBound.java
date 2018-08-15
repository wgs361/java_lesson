package generics.self_bounded_types;

import org.junit.jupiter.api.Test;

public class TestSelfBound {
    class Holder<T> {
        protected String name;
        protected T value;

        public Holder() {
            this.value = null;
        }

        public Holder(String name, T value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    class Box extends Holder<Box> {
        public Box(String name, Box value) {
            super(name, value);
        }

        @Override
        public String toString() {
            return "Box{" +
                    "name='" + name + '\'' +
                    ", value=" + value +
                    '}';
        }
    }

    @Test
    public void testBox() {
        Box box = new Box("box", null);
        Box house = new Box("house", box);
        Box city = new Box("city", house);

        System.out.println(city);
        System.out.println(city.getValue());
        System.out.println(city.getValue().getValue());
        System.out.println(city.getValue().getValue().getValue());
    }
}

package typeinfo._01_rtti;

import org.junit.jupiter.api.Test;

public class ClassGenericTest {
    @Test
    public void testGeneric() {
        Class intClass = int.class;
        intClass = double.class;

        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // Same thing
        // genericIntClass = double.class; // Illegal
    }

    @Test
    public void testWildcard() {
        Class<?> intClass = int.class;
        intClass = double.class;
        intClass = String.class;
    }

    @Test
    public void testBounded() {
        Class<? extends Number> numberClass = int.class;
        numberClass = double.class;
        numberClass = Number.class;
//        numberClass = String.class;
    }
}

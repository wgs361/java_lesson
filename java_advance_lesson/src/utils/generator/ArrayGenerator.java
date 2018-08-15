//: net/mindview/util/Generated.java
package utils.generator;

public class ArrayGenerator {
    // Fill an existing array:
    public static <T> T[] array(T[] a, Generator<T> gen) {
        return new ListData<T>(gen, a.length).toArray(a);
    }

    // Create a new array:
    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type,
                                Generator<T> gen, int size) {
        T[] a = (T[]) java.lang.reflect.Array.newInstance(type, size);
        return new ListData<T>(gen, size).toArray(a);
    }
} ///:~

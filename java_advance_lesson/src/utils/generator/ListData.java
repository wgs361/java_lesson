//: net/mindview/util/CollectionData.java
// A Collection filled with data using a generator object.
package utils.generator;

import java.util.ArrayList;

public class ListData<T> extends ArrayList<T> {
    public ListData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++)
            add(gen.next());
    }

    // A generic convenience method:
    public static <T> ListData<T>
    create(Generator<T> gen, int quantity) {
        return new ListData<T>(gen, quantity);
    }
} ///:~

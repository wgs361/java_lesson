//: typeinfo/FilledList.java
package typeinfo._03_new; /* Added by Eclipse.py */

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

class CountedInteger {
    private static long counter;
    private final long id = counter++;

    CountedInteger() {
    }

    public String toString() {
        return Long.toString(id);
    }
}

public class FilledList<T> {
    private Class<T> type;

    public FilledList(Class<T> type) {
        this.type = type;
    }

    public List<T> create(int nElements) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        List<T> result = new ArrayList<T>();

        for (int i = 0; i < nElements; i++) {
            result.add(type.newInstance());
        }

        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> fill =
                new FilledList<CountedInteger>(CountedInteger.class);
        try {
            System.out.println(fill.create(15));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
} /* Output:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
*///:~

package utils.container;

import java.util.*;

public class ContainerFactory {
    public static <T> ArrayList<T> arrayList() {
        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> linkedList() {
        return new LinkedList<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

    public static <T> HashSet<T> hashSet() {
        return new HashSet<T>();
    }

    public static <T> LinkedHashSet<T> linkedHashSet() {
        return new LinkedHashSet<T>();
    }

    public static <T> TreeSet<T> treeSet() {
        return new TreeSet<T>();
    }

    public static <K,V> HashMap<K,V> hashMap() {
        return new HashMap<K,V>();
    }

    public static <K,V> LinkedHashMap<K,V> linkedHashMap() {
        return new LinkedHashMap<K,V>();
    }

    public static <K,V> TreeMap<K,V> treeMap() {
        return new TreeMap<K,V>();
    }
}

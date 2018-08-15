package containers.collections.fill;

import org.junit.jupiter.api.Test;
import utils.generator.ListData;
import utils.generator.CountingGenerator;
import utils.generator.Generator;

import java.util.*;

public class TestListData {
    @Test
    public void testCountingGenerator() {
        System.out.println(new ListData<String>(
                new CountingGenerator.String(), 4));

        System.out.println(ListData.create(
                new CountingGenerator.String(), 4));
    }

    @Test
    public void testArrayList() {
        List<String> names = new ArrayList<String>(
                new ListData<String>(
                        new CountingGenerator.String(), 4));
        System.out.println(names);
   }

    @Test
    public void testLinkedList() {
        List<String> names = new LinkedList<String>(
                new ListData<String>(
                        new CountingGenerator.String(), 4));
        System.out.println(names);
    }

    @Test
    public void testHashSet() {
        Set<String> names = new HashSet<String>(
                new ListData<String>(
                        new CountingGenerator.String(), 4));
        System.out.println(names);
    }

    @Test
    public void testLinkedHashSet() {
        Set<String> names = new LinkedHashSet<String>(
                new ListData<String>(
                        new CountingGenerator.String(), 4));
        System.out.println(names);
    }

    @Test
    public void testTreeSet() {
        Set<String> names = new TreeSet<String>(
                new ListData<String>(
                        new CountingGenerator.String(), 4));
        System.out.println(names);
    }

    public <T> void testSet(Set<T> datas, Generator<T> generator, int count) {
        datas.addAll(new ListData<T>(generator, count));
        System.out.println(datas);
    }

    @Test
    public void testAllSet() {
        testSet(new HashSet<String>(), new CountingGenerator.String(), 4);
        testSet(new LinkedHashSet<String>(), new CountingGenerator.String(), 4);
        testSet(new TreeSet<String>(), new CountingGenerator.String(), 4);
    }
}

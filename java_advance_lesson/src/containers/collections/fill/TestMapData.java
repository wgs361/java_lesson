package containers.collections.fill;

import org.junit.jupiter.api.Test;
import utils.generator.CountingGenerator;
import utils.generator.Generator;
import utils.generator.MapData;

import java.util.*;

public class TestMapData {
    @Test
    public void testLinkedHashMapData() {
        System.out.println(new MapData<Integer, String>(
                new CountingGenerator.Integer(), new CountingGenerator.String(), 4));

        System.out.println(MapData.create(
                new CountingGenerator.Integer(), new CountingGenerator.String(), 4));
    }

    @Test
    public void testHashMap() {
        Map<String, String> names = new HashMap<String, String>(
                new MapData<String, String>(
                        new CountingGenerator.String(), new CountingGenerator.String(), 4));
        System.out.println(names);
    }

    @Test
    public void testLinkedHashMap() {
        Map<String, String> names = new LinkedHashMap<String, String>(
                new MapData<String, String>(
                        new CountingGenerator.String(), new CountingGenerator.String(), 4));
        System.out.println(names);
    }

    @Test
    public void testTreeMap() {
        Map<String, String> names = new TreeMap<String, String>(
                new MapData<String, String>(
                        new CountingGenerator.String(), new CountingGenerator.String(), 4));
        System.out.println(names);
    }

    public <U, V> void testMap(Map<U, V> datas, Generator<U> generatorU, Generator<V> generatorV, int count) {

        datas.putAll(new MapData<U, V>(generatorU, generatorV, count));
        System.out.println(datas);
    }

    @Test
    public void testAllMap() {
        testMap(new HashMap<String, String>(), new CountingGenerator.String(), new CountingGenerator.String(), 4);
        testMap(new LinkedHashMap<String, String>(), new CountingGenerator.String(), new CountingGenerator.String(),  4);
        testMap(new TreeMap<String, String>(), new CountingGenerator.String(), new CountingGenerator.String(), 4);
    }
}

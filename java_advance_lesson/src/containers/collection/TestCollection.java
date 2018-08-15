package containers.collection;

import org.junit.jupiter.api.Test;
import utils.generator.ListData;
import utils.generator.CountingGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestCollection {

    @Test
    public void test_add() {
        Collection<String> datas = new ArrayList<String>();
        datas.add("a");
        datas.add("b");
        datas.add("c");

        System.out.println(datas);
    }

    @Test
    public void test_addAll() {
        Collection<String> datas = new ArrayList<String>();
        datas.addAll(ListData.create(new CountingGenerator.String(3), 5));
        System.out.println(datas);
    }

    @Test
    public void test_remove() {
        Collection<String> datas = new ArrayList<String>();
        datas.addAll(ListData.create(new CountingGenerator.String(1), 5));
        datas.remove(new String("b"));

        System.out.println(datas);
    }

    @Test
    public void test_removeAll() {
        Collection<String> datas = new ArrayList<String>();
        datas.addAll(ListData.create(new CountingGenerator.String(1), 5));
        datas.removeAll(ListData.create(new CountingGenerator.String(1), 2));
        System.out.println(datas);
    }

    @Test
    public void test_iter() {
        Collection<String> datas = new ArrayList<String>();
        datas.addAll(ListData.create(new CountingGenerator.String(1), 5));
        for (String data : datas) {
            System.out.println(data);
        }
        datas.clear();
        System.out.println(datas.isEmpty());
    }
}

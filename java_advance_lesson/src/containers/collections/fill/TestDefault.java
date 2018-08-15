package containers.collections.fill;

import classes.person.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDefault {
    @Test
    public void test_nCopies() {
        List<Person> persons = new ArrayList<Person>(
                Collections.nCopies(4, new Person()));
        System.out.println(persons);
   }

    @Test
    public void test_fill() {
        List<Person> persons = new ArrayList<Person>(
                Collections.nCopies(4, null));
        Collections.fill(persons, new Person());
        System.out.println(persons);
    }
}

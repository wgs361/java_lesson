//: typeinfo/pets/LiteralPetCreator.java
// Using class literals.
package typeinfo._03_new.petCreator;

import typeinfo._03_new.pets.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
    // No try block needed.
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Hamster.class));

    // Types for random creation:
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class),
                    allTypes.size());

    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
} /* Output:
[class typeinfo._03_new.pets.Mutt, class typeinfo._03_new.pets.Pug, class typeinfo._03_new.pets.EgyptianMau, class typeinfo._03_new.pets.Manx, class typeinfo._03_new.pets.Cymric, class typeinfo._03_new.pets.Rat, class typeinfo._03_new.pets.Mouse, class typeinfo._03_new.pets.Hamster]
*///:~

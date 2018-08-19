//: typeinfo/pets/ForNameCreator.java
package typeinfo._04_new.petCreator;

import typeinfo._04_new.pets.Pet;
import typeinfo._04_new.pets.PetCreator;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "typeinfo._04_new.pets.Mutt",
            "typeinfo._04_new.pets.Pug",
            "typeinfo._04_new.pets.EgyptianMau",
            "typeinfo._04_new.pets.Manx",
            "typeinfo._04_new.pets.Cymric",
            "typeinfo._04_new.pets.Rat",
            "typeinfo._04_new.pets.Mouse",
            "typeinfo._04_new.pets.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add((Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
} ///:~

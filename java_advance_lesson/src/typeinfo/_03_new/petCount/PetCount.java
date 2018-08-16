//: typeinfo/PetCount.java
package typeinfo._03_new.petCount; /* Added by Eclipse.py */
// Using instanceof.

import org.junit.jupiter.api.Test;
import typeinfo._03_new.petCreator.ForNameCreator;
import typeinfo._03_new.petCreator.LiteralPetCreator;
import typeinfo._03_new.pets.*;

import java.util.HashMap;

import static utils.print.Print.print;
import static utils.print.Print.printnb;

public class PetCount {
    class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null)
                put(type, 1);
            else
                put(type, quantity + 1);
        }
    }

    public void countPets(PetCreator creator) {
        PetCounter counter = new PetCounter();
        for (Pet pet : creator.createArray(20)) {
            // List each individual pet:
            printnb(pet.getClass().getSimpleName() + " ");
            if (pet instanceof Pet)
                counter.count("Pet");
            if (pet instanceof Dog)
                counter.count("Dog");
            if (pet instanceof Mutt)
                counter.count("Mutt");
            if (pet instanceof Pug)
                counter.count("Pug");
            if (pet instanceof Cat)
                counter.count("Cat");
            if (pet instanceof Manx)
                counter.count("EgyptianMau");
            if (pet instanceof Manx)
                counter.count("Manx");
            if (pet instanceof Manx)
                counter.count("Cymric");
            if (pet instanceof Rodent)
                counter.count("Rodent");
            if (pet instanceof Rat)
                counter.count("Rat");
            if (pet instanceof Mouse)
                counter.count("Mouse");
            if (pet instanceof Hamster)
                counter.count("Hamster");
        }
        // Show the counts:
        print();
        print(counter);
    }

    @Test
    public void testForNameCreator() {
        countPets(new ForNameCreator());
    }

    @Test
    public void testLiteralPetCreator() {
        countPets(new LiteralPetCreator());
    }

}

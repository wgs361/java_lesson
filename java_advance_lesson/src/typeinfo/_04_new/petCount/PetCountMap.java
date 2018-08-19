//: typeinfo/PetCount3.java
package typeinfo._04_new.petCount; /* Added by Eclipse.py */
// Using isInstance()

import org.junit.jupiter.api.Test;
import typeinfo._04_new.petCreator.LiteralPetCreator;
import typeinfo._04_new.pets.Pet;
import typeinfo._04_new.pets.PetCreator;
import utils.algorithm.TypeCounter;
import utils.generator.MapData;

import java.util.LinkedHashMap;
import java.util.Map;

import static utils.print.Print.print;
import static utils.print.Print.printnb;

public class PetCountMap {
    class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            super(MapData.create(LiteralPetCreator.allTypes, 0));
        }

        public void count(Pet pet) {
            // Class.isInstance() eliminates instanceofs:
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet())
                if (pair.getKey().isInstance(pet))
                    put(pair.getKey(), pair.getValue() + 1);
        }

        public String toString() {
            StringBuilder result = new StringBuilder("{");
            for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
                result.append(pair.getKey().getSimpleName());
                result.append("=");
                result.append(pair.getValue());
                result.append(", ");
            }
            result.delete(result.length() - 2, result.length());
            result.append("}");
            return result.toString();
        }
    }

    @Test
    public void testPetCounter() {
        PetCounter counter = new PetCounter();
        PetCreator creator = new LiteralPetCreator();
        for (Pet pet : creator.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }

    @Test
    public void testTypeCounter() {
        TypeCounter counter = new TypeCounter(Pet.class);
        PetCreator creator = new LiteralPetCreator();
        for (Pet pet : creator.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}

/* Output:
Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat EgyptianMau Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric
{Pet=20, Dog=6, Cat=9, Rodent=5, Mutt=3, Pug=3, EgyptianMau=2, Manx=7, Cymric=5, Rat=2, Mouse=2, Hamster=1}
*///:~

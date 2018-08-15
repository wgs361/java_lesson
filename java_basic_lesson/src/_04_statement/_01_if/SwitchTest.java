package _04_statement._01_if;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static utils.print.Print.print;
import static utils.print.Print.printnb;

public class SwitchTest {
    @Test
    public void testSwitch() {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            printnb((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    print("vowel");
                    break;
                case 'y':
                case 'w':
                    print("Sometimes a vowel");
                    break;
                default:
                    print("consonant");
            }
        }
    }
}

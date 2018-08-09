package classes.animal;

public abstract class Mammalian implements Animal {
    @Override
    public void play() {
        System.out.println(this.toString() + " playing");
    }
}
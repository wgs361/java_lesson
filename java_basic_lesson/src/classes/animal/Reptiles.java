package classes.animal;

public abstract class Reptiles implements Animal {
    @Override
    public void play() {
        System.out.println(this.toString() + " playing");
    }
}
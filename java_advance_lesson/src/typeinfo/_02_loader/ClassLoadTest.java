package typeinfo._02_loader;

import org.junit.jupiter.api.Test;

class Loadable {
    static {
        System.out.println("Initializing Loadable");
    }
}

public class ClassLoadTest {
    public void showClassLoad(Class<?> clz) {
        System.out.println("show:" + clz.getName());
        ClassLoader loader = clz.getClassLoader();
        while (loader != null) {
            System.out.println(loader);
            loader = loader.getParent();
        }
    }

    @Test
    public void testLoad() {
        showClassLoad(int.class);
        showClassLoad(String.class);
        showClassLoad(Loadable.class);
    }

    @Test
    public void testLoadClass() {
        try {
            ClassLoader loader = Loadable.class.getClassLoader();
            Class meta = loader.loadClass("typeinfo._02_loader.Loadable");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("pre new");
        Loadable obj = new Loadable();
        System.out.println("post new");
    }
}

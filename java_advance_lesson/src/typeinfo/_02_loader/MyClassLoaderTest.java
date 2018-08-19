package typeinfo._02_loader;

import org.junit.jupiter.api.Test;
import utils.file.BinaryFile;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

class MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = new File("");
        file = file.getAbsoluteFile();

        String path = file.getPath();
        path = path + "\\src\\" + name.replace(".", "\\") + ".java";

        file = new File(path);

        try {
            byte[] datas = BinaryFile.read(path);

            return defineClass(name, datas,0,datas.length);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return super.findClass(name);
    }
}

public class MyClassLoaderTest {
    @Test
    public void testMyClassLoader() {

        MyClassLoader loader = new MyClassLoader();
        try {
            Class clz = loader.loadClass("classes.person.Person");
            classes.person.Person person = (classes.person.Person) clz.getConstructor(String.class, int.class)
                    .newInstance("zhangsan", 25);
            System.out.println(person);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

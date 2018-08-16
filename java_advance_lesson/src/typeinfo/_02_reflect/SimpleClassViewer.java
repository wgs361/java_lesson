package typeinfo._02_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class SimpleClassViewer {
    public static void main(String[] args) {
        Class clz = null;
        try {
            if (args.length == 0) {
                System.out.println("请输入类名.");
                return;
            }

            clz = Class.forName(args[0]);

            showPackageInfo(clz);
            showClassInfo(clz);

            System.out.println("{");

            showFiledsInfo(clz);
            showConstructorsInfo(clz);
            showMethodsInfo(clz);

            System.out.println("}");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void showPackageInfo(Class<?> clz) {
        Package p = clz.getPackage();
        System.out.printf("package %s;%n", p.getName());
    }

    private static void showClassInfo(Class<?> clz) {
        int modifier = clz.getModifiers();
        System.out.printf("%s %s %s",
                Modifier.toString(modifier),
                Modifier.isInterface(modifier) ? "interface" : "class",
                clz.getName()
        );
    }

    private static void showFiledsInfo(Class<?> clz) throws SecurityException {
        Field[] fields = clz.getDeclaredFields();
        for (Field field : fields) {
            System.out.printf("\t%s %s %s;%n",
                    Modifier.toString(field.getModifiers()),
                    field.getType().getName(),
                    field.getName()
            );
        }
    }

    private static void showConstructorsInfo(Class<?> clz) throws SecurityException {
        Constructor[] constructors = clz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.printf("\t%s %s();%n",
                    Modifier.toString(constructor.getModifiers()),
                    constructor.getName()
            );
        }
    }

    private static void showMethodsInfo(Class<?> clz) throws SecurityException {
        Method[] methods = clz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.printf("\t%s %s %s",
                    Modifier.toString(method.getModifiers()),
                    method.getReturnType().getName(),
                    method.getName()
            );

            System.out.print("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            boolean isFirst = true;
            for (Class<?> clas : parameterTypes) {
                if (isFirst) {
                    isFirst = false;
                } else {
                    System.out.print(",");
                }
                System.out.printf("%s", clas.getTypeName());
            }
            System.out.println(")");
        }
    }
}

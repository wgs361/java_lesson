package typeinfo._03_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

interface Viewable {
    void print();
}

class ViewableTest implements Viewable {
    @Override
    public void print() {
        
    }
}

public class SimpleClassViewer {
    static class ClassViewer {
        private void printModifier(int modifiers) {
            String desc = Modifier.toString(modifiers);
            if (desc.length() > 0) {
                System.out.print(desc + " ");
            }
        }

        private void printParameter(Class[] paramTypes) {
            for (int i = 0; i < paramTypes.length; i++)
            {
                if (i > 0) System.out.print(", ");
                System.out.print(paramTypes[i].getName());
            }
        }

        private void printPackageInfo(Class<?> clz) {
            Package p = clz.getPackage();
            System.out.printf("package %s;%n", p.getName());
        }

        private void printClassInfo(Class<?> clz) {
            int modifiers = clz.getModifiers();
            printModifier(modifiers);
            System.out.print(Modifier.isInterface(modifiers) ? "interfaces " : "class ");
            System.out.print(clz.getName());

            Class superClass = clz.getSuperclass();
            if (superClass != null && superClass != Object.class) {
                System.out.print(" extends " + superClass.getName());
            }
        }

        private void printFiledsInfo(Class<?> clz) throws SecurityException {
            Field[] fields = clz.getDeclaredFields();
            for (Field field : fields) {
                System.out.print("  ");
                printModifier(field.getModifiers());
                Class type = field.getType();
                String name = field.getName();
                System.out.println(type.getName() + " " + name + ";");
            }
        }

        public void printConstructorsInfo(Class cl)
        {
            Constructor[] constructors = cl.getDeclaredConstructors();

            for (Constructor c : constructors)
            {
                System.out.print("  ");
                printModifier(c.getModifiers());

                System.out.print(c.getName() + "(");
                printParameter(c.getParameterTypes());
                System.out.println(");");
            }
        }

        private void printMethodsInfo(Class<?> clz) throws SecurityException {
            Method[] methods = clz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.print("  ");
                printModifier(method.getModifiers());

                Class retType = method.getReturnType();
                String name = method.getName();
                System.out.print(retType.getName() + " " + name);

                System.out.print("(");
                printParameter(method.getParameterTypes());
                System.out.println(")");
            }
        }

        public void print(Class clz) {
            printPackageInfo(clz);

            printClassInfo(clz);

            System.out.println("{");

            printFiledsInfo(clz);
            printConstructorsInfo(clz);
            printMethodsInfo(clz);

            System.out.println("}");
        }
    }

    public static String inputName(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("请输入类名(例如java.util.Date):");
            name = in.next();
        }

        return name;
    }

    public static void main(String[] args) {
        //String name = "typeinfo._03_reflect.ViewableTest";
        String name = "java.lang.Double";

        try {
            Class clz = Class.forName(name);

            ClassViewer viewer = new ClassViewer();
            viewer.print(clz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

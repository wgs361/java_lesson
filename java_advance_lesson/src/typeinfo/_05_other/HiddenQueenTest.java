package typeinfo._05_other;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

interface Queen {
    void show();
}

class UnhappyQueen implements Queen {
    private void childhood() {
        System.out.println("悲惨的童年");
    }

    private void family() {
        System.out.println("不幸的家庭");
    }

    private void study() {
        System.out.println("求学的艰辛");
    }

    private void work() {
        System.out.println("工作的劳累");
    }

    @Override
    public void show() {
        System.out.println("光彩照人");
    }
}

class PerfectQueen extends UnhappyQueen {
}

class PackageQueen {
    static Queen makeQueen() {
        return new PerfectQueen();
    }
}

class InnerQueen {
    static class PerfectQueen extends UnhappyQueen {
    }

    static Queen makeQueen() {
        return new PerfectQueen();
    }
}

class AnonymousQueen {
    static Queen makeQueen() {
        return new UnhappyQueen() {
        };
    }
}

public class HiddenQueenTest {
    void callHiddenMethod(Object a, String methodName) {
        Method g = null;
        for (Class<?> clz = a.getClass(); clz != null;
             clz = (Class<?>)clz.getSuperclass()) {
            try {
                g = clz.getDeclaredMethod(methodName);
                g.setAccessible(true);
                g.invoke(a);
                break;
            } catch (NoSuchMethodException e) {
                //e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    public void testQueen(Queen queen) {
        for (Class<? extends Queen> clz = queen.getClass(); clz != null;
             clz = (Class<? extends Queen>)clz.getSuperclass()) {
            System.out.println(clz.getName());
        }

        queen.show();

        callHiddenMethod(queen, "childhood");
        callHiddenMethod(queen, "family");
        callHiddenMethod(queen, "study");
        callHiddenMethod(queen, "work");
    }

    @Test
    public void testUnhappyQueen() {
        testQueen(new UnhappyQueen());
    }

    @Test
    public void testPackageQueen() {
        testQueen(PackageQueen.makeQueen());
    }

    @Test
    public void testInnerQueen() {
        testQueen(InnerQueen.makeQueen());
    }

    @Test
    public void testAnonymousQueen() {
        testQueen(AnonymousQueen.makeQueen());
    }
}

package typeinfo._05_other;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static utils.print.Print.print;

interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() {
        print("doSomething");
    }

    public void somethingElse(String arg) {
        print("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        print("SimpleProxy doSomething");
        proxied.doSomething();
    }

    public void somethingElse(String arg) {
        print("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);
        if(args != null)
            for(Object arg : args)
                System.out.println("  " + arg);
        return method.invoke(proxied, args);
    }
}

class MethodSelector implements InvocationHandler {
    private Object proxied;
    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        if (method.getName().equals("doSomething"))
            print("Proxy detected the doSomething method");
        return method.invoke(proxied, args);
    }
}

public class ClassProxyTest {
    public void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    @Test
    public void testSimpleProxy() {
        consumer(new RealObject());
        print();
        consumer(new SimpleProxy(new RealObject()));
    }

    @Test
    public void testDynamicProxy() {
        RealObject real = new RealObject();
        consumer(real);
        // Insert a proxy and call again:
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class },
                new DynamicProxyHandler(real));
        consumer(proxy);
    }

    @Test
    public void testMethodSelector() {
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class },
                new MethodSelector(new RealObject()));
        consumer(proxy);
    }
}

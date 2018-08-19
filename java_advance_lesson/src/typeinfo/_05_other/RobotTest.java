package typeinfo._05_other;

import org.junit.jupiter.api.Test;
import utils.interfaces.Null;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface Operation {
    String description();
    void command();
} ///:~

interface Robot {
    String name();
    String model();
    List<Operation> operations();
}

class SnowRemovalRobot implements Robot {
    private String name;

    public SnowRemovalRobot(String name) {this.name = name;}
    public String name() { return name; }
    public String model() { return "SnowBot Series 11"; }

    public List<Operation> operations() {
        return Arrays.asList(
                new Operation() {
                    public String description() {
                        return name + " can shovel snow";
                    }
                    public void command() {
                        System.out.println(name + " shoveling snow");
                    }
                },
                new Operation() {
                    public String description() {
                        return name + " can chip ice";
                    }
                    public void command() {
                        System.out.println(name + " chipping ice");
                    }
                },
                new Operation() {
                    public String description() {
                        return name + " can clear the roof";
                    }
                    public void command() {
                        System.out.println(name + " clearing roof");
                    }
                }
        );
    }
}

class NullRobotProxyHandler implements InvocationHandler {
    private String nullName;
    private Robot proxied = new NRobot();
    NullRobotProxyHandler(Class<? extends Robot> type) {
        nullName = type.getSimpleName() + " NullRobot";
    }
    private class NRobot implements Null, Robot {
        public String name() { return nullName; }
        public String model() { return nullName; }
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }
    public Object
    invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        return method.invoke(proxied, args);
    }
}

class NullRobot {
    public static Robot
    newNullRobot(Class<? extends Robot> type) {
        return (Robot) Proxy.newProxyInstance(
                NullRobot.class.getClassLoader(),
                new Class[]{ Null.class, Robot.class },
                new NullRobotProxyHandler(type));
    }
}

public class RobotTest {
    public void showRobot(Robot r) {
        if(r instanceof Null) {
            System.out.println("[Null Robot]");
        }

        System.out.println("Robot name: " + r.name());
        System.out.println("Robot model: " + r.model());
        for(Operation operation : r.operations()) {
            System.out.println(operation.description());
            operation.command();
        }
    }

    @Test
    public void testSnowRemovalRobot() {
        showRobot(new SnowRemovalRobot("Slusher"));
    }

    @Test
    public void testNullRobot()
    {
        Robot[] bots = {
                new SnowRemovalRobot("SnowBee"),
                NullRobot.newNullRobot(SnowRemovalRobot.class)
        };
        for(Robot bot : bots) {
            showRobot(bot);
        }
    }
}

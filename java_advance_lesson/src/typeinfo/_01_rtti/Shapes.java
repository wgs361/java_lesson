package typeinfo._01_rtti;

import java.util.Arrays;
import java.util.List;

interface Shape {
    void draw();
}

class CAD {
    public void draw(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw()");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draw()");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Triangle draw()");
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(), new Square(), new Triangle()
        );

        CAD cad = new CAD();
        cad.draw(shapes);
    }
}
/* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~

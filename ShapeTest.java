abstract class Shape {
    // Abstract methods
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
// Circle class
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    //@Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    //@Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
// Triangle class
class Triangle extends Shape {
    double a, b, c;   // three sides
    double base, height;
    Triangle(double a, double b, double c, double base, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.height = height;
    }
    //@Override
    double calculateArea() {
        return 0.5 * base * height;
    }
    //@Override
    double calculatePerimeter() {
        return a + b + c;
    }
}
// Main class
public class ShapeTest {
    public static void main(String[] args) {
        Shape s;   // Shape reference (polymorphism)
        s = new Circle(5);
        System.out.println("Circle Area: " + s.calculateArea());
        System.out.println("Circle Perimeter: " + s.calculatePerimeter());
        s = new Triangle(3, 4, 5, 4, 3);
        System.out.println("Triangle Area: " + s.calculateArea());
        System.out.println("Triangle Perimeter: " + s.calculatePerimeter());
    }
} 


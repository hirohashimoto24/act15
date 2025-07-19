// 1. Interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// 2. Abstract Class
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}

// 3a. Circle Class
class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, radius, radius);  // For Circle, length and width aren't used the same way
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// 3b. Rectangle Class
class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// 4. Main Class
public class Task15 {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 10, 4);

        System.out.println("Circle:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println();

        System.out.println("Rectangle:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}

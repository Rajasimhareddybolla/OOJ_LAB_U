
import java.util.Scanner;

abstract class Shape {
    int a, b;

    abstract double printArea();

    void Value() {
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
    }

    void Valuerad() {
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
    }
}

class Rectangle extends Shape {
    double printArea() {
        return a * b;
    }
}

class Triangle extends Shape {
    double printArea() {
        return 0.5 * a * b;
    }
}

class Circle extends Shape {
    double printArea() {
        return 3.14 * a * a;
    }
}

class shapeArea {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        System.out.println("Enter the values of length and breadth: ");
        r.Value();
        Triangle t = new Triangle();
        System.out.println("Enter the values of base and height: ");
        t.Value();
        Circle c = new Circle();
        System.out.println("Enter the value of radius: ");
        c.Valuerad();
        System.out.println("The area of rectangle is: " + r.printArea());
        System.out.println("The area of Triangle is: " + t.printArea());
        System.out.println("The area of Circle is: " + c.printArea());

    }
}
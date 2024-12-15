import java.util.Scanner;

interface Polygon {
    void setSides(int[] sides);
    void showPerimeter();
}

class Square implements Polygon {
    private int[] sides = new int[4];
    private float perimeter;


    public void setSides(int[] sides) {
        this.sides = sides;
        this.perimeter = 0;
        for (int side : sides) {
            this.perimeter += side;
        }
    }

  
    public void showPerimeter() {
        System.out.println("Perimeter: " + perimeter);
    }

    public void Area() {
        int side = sides[0];
        int area = side * side;
        System.out.println("Area: " + area);
    }
}

class Rectangle implements Polygon {
    private int[] sides = new int[4];
    private float perimeter;

   
    public void setSides(int[] sides) {
        this.sides = sides;
        this.perimeter = 0;
        for (int side : sides) {
            this.perimeter += side;
        }
    }

    
    public void showPerimeter() {
        System.out.println("Perimeter: " + perimeter);
    }

    public void Area() {
        int area = sides[0] * sides[1];
        System.out.println("Area: " + area);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Square");
        System.out.print("Square side: ");
        int squareSide = sc.nextInt();
        int[] squareSides = {squareSide, squareSide, squareSide, squareSide};
        Square square = new Square();
        square.setSides(squareSides);
        square.Area();
        square.showPerimeter();

        System.out.println("\nRectangle");
        System.out.print("Rectangle width: ");
        int rectWidth = sc.nextInt();
        System.out.print("Rectangle length: ");
        int rectLength = sc.nextInt();
        int[] rectSides = {rectWidth, rectLength, rectWidth, rectLength};
        Rectangle rectangle = new Rectangle();
        rectangle.setSides(rectSides);
        rectangle.Area();
        rectangle.showPerimeter();
    }
}

import java.util.*;
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public double calculateArea() {
        System.out.println("Calculating area of shape");
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("this is a cirlce Drawing");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("this is a cylinder drawing");
    }

    @Override
    public double calculateArea() {
        // Surface area = 2πr(h + r)
        return 2 * 3.14 * radius * (height + radius);
    }
}

public class artclass{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;

        System.out.println("Choose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Cylinder");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.print("Enter radius: ");
                double cylRadius = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                shape = new Cylinder(cylRadius, height);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        System.out.println("Choose an operation:");
        System.out.println("1. Draw");
        System.out.println("2. Calculate Area");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                shape.draw();
                break;
            case 2:
                double area = shape.calculateArea();
                System.out.println("Area: " + area);
                break;
            default:
                System.out.println("Invalid operation.");
        }
        scanner.close();
    }
}
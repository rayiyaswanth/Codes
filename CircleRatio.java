import java.util.Scanner;

public class CircleRatio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Constants
        double pi = Math.PI;

        // Calculate required values
        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;

        // Calculate ratios
        double ratioCircumferenceToDiameter = pi; // Always π
        double ratioAreaToCircumference = radius / 2;

        // Display results
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
        System.out.println("Ratio of Circumference to Diameter: " + ratioCircumferenceToDiameter);
        System.out.println("Ratio of Area to Circumference: " + ratioAreaToCircumference);

        scanner.close();
    }
}



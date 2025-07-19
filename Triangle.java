
    import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three sides of the triangle
        System.out.print("Enter side 1: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        double b = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        double c = scanner.nextDouble();

        // Check if the sides form a valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The sides form a valid triangle.");

            // Calculate perimeter
            double perimeter = a + b + c;
            System.out.println("Perimeter of the triangle: " + perimeter);

            // Calculate area using Heron's formula
            double s = perimeter / 2; // Semi-perimeter
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of the triangle: " + area);

            // Determine the type of triangle
            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("The given sides do NOT form a valid triangle.");
        }

        scanner.close();
    }
}

    


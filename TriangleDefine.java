/**
 * Class contains methods to define the type of triangle
 */
public class TriangleDefine {
    /**
     * Method checks invalid sides
     *
     * @param a=side of triangle
     * @param b=side of triangle
     * @param c=side of triangle
     * @return the result: valid/invalid triangle
     */
    public String triangleExists(double a, double b, double c) {
        if (a > b + c || b > a + c || c > a + b || a == 0 || b == 0 || c == 0) {
            System.out.println("Triangle is invalid. Try again");
        }
        return ("The traingle is invalid.");
    }

    /**
     * Method checks if the triangle has different sides
     *
     * @param a=side of triangle
     * @param b=side of triangle
     * @param c=     side of triangle
     * @return the result: if the triangle has different sides
     */
    public String triangleWithDifferentSides(double a, double b, double c) {
        if (a != b & b != c & c != a) {
            System.out.println("The triangle has different sides");
        }
        return ("The triangle has different sides");
    }

    /**
     * Method checks if the triangleis isosceles
     *
     * @param a=side of triangle
     * @param b=side of triangle
     * @param b=side of triangle
     * @return the result: if the triangle is isosceles
     */
    public String triangleIsosceles(double a, double b, double c) {
        if ((a == b && a != b && b != c) || (b == c && b != a && c != a) || (a == c && a != b && c != b)) {
            System.out.println("The triangle is isosceles");
        }
        return ("The triangle is isosceles");
    }

    /**
     * Method checks if the triangle is equilateral
     *
     * @param a=side of triangle
     * @param b=side of triangle
     * @param c=side of triangle
     * @return the reult:if the triangle is equilateral
     */
    public String triangleEquilateral(double a, double b, double c) {
        if ((a == b) && (b == c) && (a == c)) {
            System.out.println("The triangle is equilateral");
        }
        return ("The triangle is equilateral");

    }
}

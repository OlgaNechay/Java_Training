package com.company;

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
     */
    public void triangleExists(double a, double b, double c) {
        if (a > b + c || b > a + c || c > a + b || a == 0 || b == 0 || c == 0) {
            System.out.println("Triangle is invalid. Try again");
        } else if (a != b & b != c & c != a) {
            System.out.println("The triangle has different sides");
            if ((a * a + b * b == c * c) || (a * a + c * c == b * c) || (b * b + c * c == a * a))
                System.out.println("The triangle is rectangular");
            if (a * a + b * b > c * c || b * b + c * c > a * a || a * a + c * c > b * b)
                System.out.println("The triangle is acute-angled");
            if (a * a + b * b < c * c || b * b + c * c < a * a || a * a + c * c < b * b)
                System.out.println("The triangle is obtuse");

        }
    }

    /**
     * Method checks if the triangle has different sides
     *
     * @param a=side of triangle
     * @param b=side of triangle
     * @param c=side of triangle
     */
    public void triangleWithDifferentSides(double a, double b, double c) {
        if ((a > 0 && b > 0 && c > 0) && (a != b & b != c & c != a)) {
            System.out.println("The triangle has different sides");
        }

    }

    /**
     * Method checks if the triangleis isosceles
     *
     * @param a=side of triangle
     * @param b=side of triangle
     * @param b=side of triangle
     */
    public void triangleIsosceles(double a, double b, double c) {
        if ((a > 0 && b > 0 && c > 0) && ((a == b && a != c && b != c) || (b == c && b != a && c != a) || (a == c && a != b && c != b))) {
            System.out.println("The triangle is isosceles");
        }
    }

    /**
     * Method checks if the triangle is equilateral
     *
     * @param a=side of triangle
     * @param b=side of triangle
     * @param c=side of triangle
     */
    public void triangleEquilateral(double a, double b, double c) {
        if ((a > 0 && b > 0 && c > 0) && ((a == b) && (b == c) && (a == c))) {
            System.out.println("The triangle is equilateral");
        }

    }
}

package com.company;


public class Triangle {


    public void typeTriangle(double a, double b, double c) {


        while (true) {
            if (a > b + c || b > a + c || c > a + b || a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Triangle is invalid. Try again");
                break;
            }
            if (a != b & b != c & c != a) {
                System.out.println("The triangle has different sides");

            }
            if (((a == b && a != c && b != c) ||
                    (b == c && b != a && c != a) ||
                    (a == c && a != b && c != b))) {
                System.out.println("The triangle is isosceles");
                break;
            }
            if (((a == b) && (b == c) && (a == c))) {
                System.out.println("The triangle is equilateral");
                break;
            }
            double Mmax1 = Math.max(a, b);
            double Mmax2 = Math.max(Mmax1, c);
            double Mmin1 = Math.min(a, b);
            double Mmin2 = Math.min(Mmin1, c);
            double Mmean = (a + b + c) - (Mmax1 + Mmin1);

            if (Math.pow(Mmax2, 2) == Math.pow(Mmin2, 2) + Math.pow(Mmean, 2)) {
                System.out.println("The triangle is rectangular");
            }

            if (Math.pow(Mmax2, 2) < Math.pow(Mmin2, 2) + Math.pow(Mmean, 2)) {
                System.out.println("The triangle is acute-angled");
            }

            if (Math.pow(Mmax2, 2) > Math.pow(Mmin2, 2) + Math.pow(Mmean, 2)) {
                System.out.println("The triangle is obtuse");
            }
        break;
        }

    }


}

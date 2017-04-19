package com.company;
import java.util.Scanner;


public class Main extends Triangle {

    public static void main(String[] args) {
        try {

            System.out.println("Enter the sides of triangle");
            Scanner in = new Scanner(System.in);

            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();
            Triangle triangle = new Triangle();
            triangle.typeTriangle(a, b, c);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}




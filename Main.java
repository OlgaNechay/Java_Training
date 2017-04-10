package com.company;

import java.util.Scanner;



/**
 * Class contains method to realise methods from the class TriangleDefine
 * Class extends methods from the class TriangleDefine
 */

public class Main extends TriangleDefine {
    /**
     * Method realises methods from the class TriangleDefine
     */
    public static void main(String[] args) {
        try {
            System.out.println("Enter the sides of triangle");
            Scanner in = new Scanner(System.in); //Reading the variables

            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();

            TriangleDefine triangle = new TriangleDefine();//Declaration of variable of class TrianleDefine
            triangle.triangleExists(a, b, c);//вызов метода с параметрами a,b,c, который проверяет наличие треугольника,его разносторонность,тип
            // в зависимости от угла
            triangle.triangleIsosceles(a, b, c);//вызов метода с параметрами a,b,c,который проверяет треугольник на равнобедренность
            triangle.triangleEquilateral(a, b, c);//вызов метода с параметрами a,b,c,который проверяет треугольник на равносторонность

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}




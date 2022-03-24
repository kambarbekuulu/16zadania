package com.company;

public class Circle {
    private static final double PI=3.14;
    static void area(int radius){
        double  area = PI * (radius * radius);
        System.out.println(area);
    }

    static void circumference(int radius){
    double circumference =PI* 2 * radius ;
        System.out.println(circumference);
    }
}

package com.mycompany.shapeobj;

public class Circle extends Shape
{
    private static final double pi=3.14;
    private double radius;
    
    public Circle(double r)
    {
        radius = r;
    }
    
    public double calculateArea()
    {
        return pi * radius * radius;
    }
}

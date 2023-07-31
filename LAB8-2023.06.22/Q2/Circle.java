package com.mycompany.shapecalcu;

public class Circle implements Shape
{
   private static final double pi=3.14;
   private double radius;
   
   public Circle(double radius)
   {
       this.radius=radius;
   }
   
   public double calculateArea()
    {
        return pi*radius*radius;
    }
    
    public double calculatePerimeter()
    {
        return 2*pi*radius;
    }
}

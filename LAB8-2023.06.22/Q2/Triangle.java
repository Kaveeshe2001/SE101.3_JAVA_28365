package com.mycompany.shapecalcu;

public class Triangle 
{
    private double base, height, hypotenuse;
    
    public Triangle(double base, double height)
    {
        this.base=base;
        this.height=height;
        this.hypotenuse=Math.sqrt(base*base + height*height);
    }
    public double calculateArea()
    {
        return 0.5 * base * height;
    }
    
    public double calculatePerimeter()
    {
        return base + height + hypotenuse;
    }
}

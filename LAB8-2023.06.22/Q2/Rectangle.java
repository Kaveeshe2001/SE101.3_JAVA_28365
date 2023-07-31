package com.mycompany.shapecalcu;

public class Rectangle 
{
    private double width, height;
    
    public Rectangle(double w, double h)
    {
        width=w;
        height=h;
    }
    public double calculateArea()
    {
        return width*height;
    }
    
    public double calculatePerimeter()
    {
        return 2*width + 2*height;
    }
}

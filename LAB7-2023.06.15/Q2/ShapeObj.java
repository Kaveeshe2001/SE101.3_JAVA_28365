package com.mycompany.shapeobj;

public class ShapeObj {

    public static void main(String[] args) 
    {
        Circle c = new Circle(7);
        System.out.println("Area of Circle: "+c.calculateArea());
        
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Area of Rectangle: "+r.calculateArea());
    }
}

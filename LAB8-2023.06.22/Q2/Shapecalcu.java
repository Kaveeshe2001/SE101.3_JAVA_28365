package com.mycompany.shapecalcu;

public class Shapecalcu {

    public static void main(String[] args) 
    {
        Circle c1 = new Circle(7.14);
        System.out.println("Area of Circle: "+c1.calculateArea());
        System.out.println("Perimeter of Circle: "+c1.calculatePerimeter());
        
        Rectangle r1 = new Rectangle(6, 8);
        System.out.println("Area of Rectangle: "+r1.calculateArea());
        System.out.println("Perimeter of Rectangle: "+r1.calculatePerimeter());
        
        Triangle t1 = new Triangle(4, 5);
        System.out.println("Area of Triangle: "+t1.calculateArea());
        System.out.println("Perimeter of Triangle: "+t1.calculatePerimeter());
    }
}

package com.mycompany.unitest;

public class UniTest {

    public static void main(String[] args) 
    {
        Lecturer l = new Lecturer();
        l.setName("Waduge");
        l.setID(1234);
        l.setProg("English");
        
        Student s = new Student();
        s.setName("Kaveeshe");
        s.setID(21453);
        s.setCourse("Maths");
        
        System.out.println("Lecturer Name: "+l.getName());
        System.out.println("Lecturer Id: "+l.getID());
        System.out.println("Programme: "+l.getProg());
        System.out.println("Student Name: "+s.getName());
        System.out.println("Student Id: "+s.getID());
        System.out.println("Course: "+s.getCourse());
    }
}

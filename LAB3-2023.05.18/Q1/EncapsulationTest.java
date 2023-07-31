package com.mycompany.encapsulationtest;

public class EncapsulationTest {

    public static void main(String[] args) 
    {
        Encapsulation en = new Encapsulation();
        en.setEmpName("Kaveesha");
        System.out.println("Employee Name: "+en.getEmpName());
        en.setAge(22);
        System.out.println("Employee Age: "+en.getAge());
        en.setSalary(50000.00f);
        System.out.println("Salary: "+en.getSalary());
    }
}

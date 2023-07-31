package com.mycompany.encapsulationtest2;

public class EncapsulationTest2 {

    public static void main(String[] args) 
    {
        Encapsulation2 e = new Encapsulation2(10000);
        e.setName("Bogdan");
        System.out.println("Employee Name: "+e.getName());
        e.setBSalary(50000);
        System.out.println("Basic Salary: "+e.getBSalary());
        System.out.println("Bonus: "+e.getBonus());
        e.bAmount();
    }
}

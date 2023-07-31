package com.mycompany.test;

public class Test {

    public static void main(String[] args) 
    {
        Employee e1 = new Employee();
        e1.setId(1234);
        e1.setEmpName("Bogdan");
        e1.setEmpDesignation("Galle");
        System.out.println("Employee1 ID: "+e1.getId());
        System.out.println("Employee1 Name: "+e1.getEmpName());
        System.out.println("Employee1 Designation: "+e1.getEmpDesignation());
        
        Employee e2 = new Employee();
        e2.setId(5678);
        e2.setEmpName("Bird");
        e2.setEmpDesignation("Homagama");
        System.out.println("Employee2 ID: "+e2.getId());
        System.out.println("Employee2 Name: "+e2.getEmpName());
        System.out.println("Employee2 Designation: "+e2.getEmpDesignation());
    }
}

package com.mycompany.encapsulationtest;

public class Encapsulation 
{
    //data
    private String empName;
    private int  age;
    private float salary;
    
    //setter methode for name
    public void setEmpName(String empName)
    {
        this.empName=empName;
    }
    
    //getter methode for name
    public String getEmpName()
    {
        return empName;
    }
    
    //setter method for age
    public void setAge(int age)
    {
        this.age=age;
    }
    
    //getter method for age
    public int getAge()
    {
        return age;
    }
    
    //setter method for salary
    public void setSalary(float salary)
    {
        this.salary=salary;
    }
    
    //getter method for salary
    public float getSalary()
    {
        return salary;
    }
}

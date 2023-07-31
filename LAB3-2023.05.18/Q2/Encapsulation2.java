package com.mycompany.encapsulationtest2;

public class Encapsulation2 
{
    //data
    private String empName;
    private float basicSalary;
    private float bonus;
    float bonusAmount;
    
    //setter method for Emp Name
    public void setName(String empName)
    {
        this.empName = empName;
    }
    
    //getter method for Emp Name
    public String getName()
    {
        return empName;
    }
    
    //setter method for Basic Salary
    public void setBSalary(float basicSalary)
    {
        this.basicSalary = basicSalary;
    }
    
    //getter method for Basic Salary
    public float getBSalary()
    {
        return basicSalary;
    }
    
    //constructor method for bonus
    public Encapsulation2(float bonus)
    {
        this.bonus = bonus;
    }
    
    public float getBonus()
    {
        return bonus;
    }
    
    public void bAmount()
    {
       bonusAmount = basicSalary + bonus;
       System.out.println("Bonus Amount : "+bonusAmount);
    }
}

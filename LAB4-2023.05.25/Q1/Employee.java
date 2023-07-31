package com.mycompany.test;

public class Employee 
{
    private int empId;
    private String empName;
    private String empDesignation;
    
    public void setId(int empId)
    {
        this.empId = empId;
    }
    
    public int getId()
    {
        return empId;
    }
    
    public void setEmpName(String empName)
    {
        this.empName = empName;
    }
    
    public String getEmpName()
    {
        return empName;
    }
    
    public void setEmpDesignation(String empDesignation)
    {
        this.empDesignation = empDesignation;
    }
    
    public String getEmpDesignation()
    {
        return empDesignation;
    }
}

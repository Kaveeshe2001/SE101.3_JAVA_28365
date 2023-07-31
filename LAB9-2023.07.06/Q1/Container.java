package com.mycompany.mainvolume;

public abstract class Container 
{
    protected double height;
    protected double radius;
    
    public Container(double height, double radius)
    {
        this.height = height;
        this.radius = radius;
    }
    
    public abstract double calculateVolume();
}
